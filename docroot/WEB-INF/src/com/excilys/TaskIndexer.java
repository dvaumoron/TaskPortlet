package com.excilys;

import java.util.Locale;

import javax.portlet.PortletURL;

import com.excilys.model.Task;
import com.excilys.service.TaskLocalServiceUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.DocumentImpl;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;

public class TaskIndexer extends BaseIndexer {

	private static final String PORTLET_ID = "Task";
	private static final String[] CLASSNAMES = new String[]{Task.class.getName()};

	@Override
	public String[] getClassNames() {
		return CLASSNAMES;
	}

	@Override
	public String getPortletId() {
		return PORTLET_ID;
	}

	@Override
	protected void doDelete(Object object) throws Exception {
		Task task = (Task) object;
		
		Document doc = doGetDocument(task);

		SearchEngineUtil.deleteDocument(SearchEngineUtil.getDefaultSearchEngineId(), task.getCompanyId(), doc.getUID());
	}

	@Override
	protected Document doGetDocument(Object object) throws Exception {
		Task task = (Task) object;
		
		Document doc = new DocumentImpl();
		
		doc.addUID(PORTLET_ID, task.getTaskId());
		
		doc.addKeyword(Field.ENTRY_CLASS_NAME, Task.class.getName());
		doc.addKeyword(Field.ENTRY_CLASS_PK, task.getTaskId());
		
		doc.addText(Field.TITLE, task.getName());
		doc.addText(Field.DESCRIPTION, task.getDescription());
		
		return doc;
	}

	@Override
	protected Summary doGetSummary(Document doc, Locale locale, String snippet,
			PortletURL url) throws Exception {
		return new Summary(doc.get(Field.TITLE), snippet, url);
	}

	@Override
	protected void doReindex(Object object) throws Exception {
		Task task = (Task) object;

		Document doc = doGetDocument(task);

		SearchEngineUtil.updateDocument(SearchEngineUtil.getDefaultSearchEngineId(), task.getCompanyId(), doc);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		for(String id : ids) {
			long companyId = Long.parseLong(id);
			for(Task task : TaskLocalServiceUtil.findByCompanyId(companyId)) {
				doReindex(task);
			}
		}

	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		Task task = TaskLocalServiceUtil.findById(classPK);
		doReindex(task);
	}

	@Override
	protected String getPortletId(SearchContext arg0) {
		return PORTLET_ID;
	}

}
