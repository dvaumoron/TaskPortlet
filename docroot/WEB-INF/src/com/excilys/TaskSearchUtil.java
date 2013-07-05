package com.excilys;

import java.util.ArrayList;
import java.util.List;

import com.excilys.model.Task;
import com.excilys.service.TaskLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.Query;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.search.StringQueryFactoryUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class TaskSearchUtil {

	public static List<Task> search(long companyId, String filter, int start, int end) {
		List<Task> tasks = new ArrayList<Task>();
		try {
			Hits hits = searchInternal(companyId, filter, start, end);
			for(Document doc : hits.getDocs()) {
				try {
					tasks.add(TaskLocalServiceUtil.findById(Long.parseLong(doc.get(Field.ENTRY_CLASS_PK))));
				} catch (NoSuchTaskException nste) {
					nste.printStackTrace();
				} catch (NumberFormatException nfe) {
					nfe.printStackTrace();
				} catch (SystemException se) {
					se.printStackTrace();
				}
			}
		} catch (SearchException se) {
			se.printStackTrace();
		}
		return tasks;
	}
	
	public static int searchCount(long companyId, String filter) {
		int count = 0;
		try {
			count = searchInternal(companyId, filter, 0, 1).getLength();
		} catch (SearchException se) {
			se.printStackTrace();
		}
		return count;
	}
	
	private static Hits searchInternal(long companyId, String filter, int start, int end) throws SearchException {

		StringBundler queryBuffer = new StringBundler();
		queryBuffer.append("+entryClassName:").append(Task.class.getName());
		
		if (Validator.isNotNull(filter)) {
			queryBuffer.append(" +(").append(Field.TITLE).append(StringPool.COLON).append(filter)
				.append(StringPool.SPACE).append(Field.DESCRIPTION).append(StringPool.COLON)
				.append(filter).append(StringPool.CLOSE_PARENTHESIS);
		}
		
		Query query = StringQueryFactoryUtil.create(queryBuffer.toString());
		
		Sort[] sorts = new Sort[]{SortFactoryUtil.create(Field.TITLE, false)};
		return SearchEngineUtil.search(SearchEngineUtil.getDefaultSearchEngineId(), companyId, query , sorts , start, end);
	}

}
