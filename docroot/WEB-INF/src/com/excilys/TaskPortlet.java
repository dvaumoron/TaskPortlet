package com.excilys;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.excilys.model.Task;
import com.excilys.service.TaskLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class TaskPortlet
 */
public class TaskPortlet extends MVCPortlet {

	@Override
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		
		String action = ParamUtil.get(actionRequest, "action", StringPool.BLANK);
		
		if ("filter".equals(action)) {
			String filter = ParamUtil.get(actionRequest, "filter", StringPool.BLANK);
			
			actionResponse.setRenderParameter("filter", filter);
		} else {
			long taskId = ParamUtil.get(actionRequest, "taskId", 0);
			String taskName = ParamUtil.get(actionRequest, "taskName", StringPool.BLANK);
			String taskDescription = ParamUtil.get(actionRequest, "taskDescription", StringPool.BLANK);
		
			try {
				if (taskId == 0) {
					Task newTask = TaskLocalServiceUtil.createTask(CounterLocalServiceUtil.increment());
					newTask.setCompanyId(PortalUtil.getCompanyId(actionRequest));
					newTask.setName(taskName);
					newTask.setDescription(taskDescription);
					TaskLocalServiceUtil.updateTask(newTask);
				} else {
					Task task = TaskLocalServiceUtil.findById(taskId);
					task.setName(taskName);
					task.setDescription(taskDescription);
					TaskLocalServiceUtil.updateTask(task);
				}
			} catch (SystemException se) {
				se.printStackTrace();
			} catch (NoSuchTaskException nste) {
				nste.printStackTrace();
			}
		}

		super.processAction(actionRequest, actionResponse);
	}

}
