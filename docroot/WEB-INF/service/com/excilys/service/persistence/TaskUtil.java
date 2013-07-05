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

package com.excilys.service.persistence;

import com.excilys.model.Task;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the task service. This utility wraps {@link TaskPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author denis
 * @see TaskPersistence
 * @see TaskPersistenceImpl
 * @generated
 */
public class TaskUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Task task) {
		getPersistence().clearCache(task);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Task> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Task> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Task> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Task update(Task task, boolean merge)
		throws SystemException {
		return getPersistence().update(task, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Task update(Task task, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(task, merge, serviceContext);
	}

	/**
	* Caches the task in the entity cache if it is enabled.
	*
	* @param task the task
	*/
	public static void cacheResult(com.excilys.model.Task task) {
		getPersistence().cacheResult(task);
	}

	/**
	* Caches the tasks in the entity cache if it is enabled.
	*
	* @param tasks the tasks
	*/
	public static void cacheResult(java.util.List<com.excilys.model.Task> tasks) {
		getPersistence().cacheResult(tasks);
	}

	/**
	* Creates a new task with the primary key. Does not add the task to the database.
	*
	* @param taskId the primary key for the new task
	* @return the new task
	*/
	public static com.excilys.model.Task create(long taskId) {
		return getPersistence().create(taskId);
	}

	/**
	* Removes the task with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskId the primary key of the task
	* @return the task that was removed
	* @throws com.excilys.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task remove(long taskId)
		throws com.excilys.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(taskId);
	}

	public static com.excilys.model.Task updateImpl(
		com.excilys.model.Task task, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(task, merge);
	}

	/**
	* Returns the task with the primary key or throws a {@link com.excilys.NoSuchTaskException} if it could not be found.
	*
	* @param taskId the primary key of the task
	* @return the task
	* @throws com.excilys.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task findByPrimaryKey(long taskId)
		throws com.excilys.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(taskId);
	}

	/**
	* Returns the task with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taskId the primary key of the task
	* @return the task, or <code>null</code> if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task fetchByPrimaryKey(long taskId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(taskId);
	}

	/**
	* Returns the task where taskId = &#63; or throws a {@link com.excilys.NoSuchTaskException} if it could not be found.
	*
	* @param taskId the task ID
	* @return the matching task
	* @throws com.excilys.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task findById(long taskId)
		throws com.excilys.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findById(taskId);
	}

	/**
	* Returns the task where taskId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param taskId the task ID
	* @return the matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task fetchById(long taskId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchById(taskId);
	}

	/**
	* Returns the task where taskId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param taskId the task ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task fetchById(long taskId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchById(taskId, retrieveFromCache);
	}

	/**
	* Returns all the tasks where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.excilys.model.Task> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the tasks where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.excilys.model.Task> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the tasks where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.excilys.model.Task> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first task in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws com.excilys.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.excilys.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first task in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last task in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws com.excilys.NoSuchTaskException if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.excilys.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last task in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the tasks before and after the current task in the ordered set where companyId = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws com.excilys.NoSuchTaskException if a task with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task[] findByCompanyId_PrevAndNext(
		long taskId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.excilys.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(taskId, companyId,
			orderByComparator);
	}

	/**
	* Returns all the tasks.
	*
	* @return the tasks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.excilys.model.Task> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of tasks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.excilys.model.Task> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tasks
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.excilys.model.Task> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the task where taskId = &#63; from the database.
	*
	* @param taskId the task ID
	* @return the task that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.excilys.model.Task removeById(long taskId)
		throws com.excilys.NoSuchTaskException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().removeById(taskId);
	}

	/**
	* Removes all the tasks where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes all the tasks from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of tasks where taskId = &#63;.
	*
	* @param taskId the task ID
	* @return the number of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public static int countById(long taskId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countById(taskId);
	}

	/**
	* Returns the number of tasks where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching tasks
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns the number of tasks.
	*
	* @return the number of tasks
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static TaskPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (TaskPersistence)PortletBeanLocatorUtil.locate(com.excilys.service.ClpSerializer.getServletContextName(),
					TaskPersistence.class.getName());

			ReferenceRegistry.registerReference(TaskUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(TaskPersistence persistence) {
	}

	private static TaskPersistence _persistence;
}