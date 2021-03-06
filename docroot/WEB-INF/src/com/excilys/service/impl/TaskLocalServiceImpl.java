/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.excilys.service.impl;

import java.util.List;

import com.excilys.NoSuchTaskException;
import com.excilys.model.Task;
import com.excilys.service.base.TaskLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the task local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.excilys.service.TaskLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author denis
 * @see com.excilys.service.base.TaskLocalServiceBaseImpl
 * @see com.excilys.service.TaskLocalServiceUtil
 */
public class TaskLocalServiceImpl extends TaskLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.excilys.service.TaskLocalServiceUtil} to access the task local service.
	 */

	public Task findById(long taskId) throws SystemException, NoSuchTaskException {
		return taskPersistence.findById(taskId);
	}

	public List<Task> findByCompanyId(long companyId) throws SystemException {
		return taskPersistence.findByCompanyId(companyId);
	}
}