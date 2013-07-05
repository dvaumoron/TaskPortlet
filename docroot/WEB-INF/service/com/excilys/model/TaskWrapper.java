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

package com.excilys.model;

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Task}.
 * </p>
 *
 * @author    denis
 * @see       Task
 * @generated
 */
public class TaskWrapper implements Task, ModelWrapper<Task> {
	public TaskWrapper(Task task) {
		_task = task;
	}

	public Class<?> getModelClass() {
		return Task.class;
	}

	public String getModelClassName() {
		return Task.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taskId", getTaskId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("done", getDone());
		attributes.put("description", getDescription());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Boolean done = (Boolean)attributes.get("done");

		if (done != null) {
			setDone(done);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this task.
	*
	* @return the primary key of this task
	*/
	public long getPrimaryKey() {
		return _task.getPrimaryKey();
	}

	/**
	* Sets the primary key of this task.
	*
	* @param primaryKey the primary key of this task
	*/
	public void setPrimaryKey(long primaryKey) {
		_task.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the task ID of this task.
	*
	* @return the task ID of this task
	*/
	public long getTaskId() {
		return _task.getTaskId();
	}

	/**
	* Sets the task ID of this task.
	*
	* @param taskId the task ID of this task
	*/
	public void setTaskId(long taskId) {
		_task.setTaskId(taskId);
	}

	/**
	* Returns the company ID of this task.
	*
	* @return the company ID of this task
	*/
	public long getCompanyId() {
		return _task.getCompanyId();
	}

	/**
	* Sets the company ID of this task.
	*
	* @param companyId the company ID of this task
	*/
	public void setCompanyId(long companyId) {
		_task.setCompanyId(companyId);
	}

	/**
	* Returns the name of this task.
	*
	* @return the name of this task
	*/
	public java.lang.String getName() {
		return _task.getName();
	}

	/**
	* Sets the name of this task.
	*
	* @param name the name of this task
	*/
	public void setName(java.lang.String name) {
		_task.setName(name);
	}

	/**
	* Returns the done of this task.
	*
	* @return the done of this task
	*/
	public boolean getDone() {
		return _task.getDone();
	}

	/**
	* Returns <code>true</code> if this task is done.
	*
	* @return <code>true</code> if this task is done; <code>false</code> otherwise
	*/
	public boolean isDone() {
		return _task.isDone();
	}

	/**
	* Sets whether this task is done.
	*
	* @param done the done of this task
	*/
	public void setDone(boolean done) {
		_task.setDone(done);
	}

	/**
	* Returns the description of this task.
	*
	* @return the description of this task
	*/
	public java.lang.String getDescription() {
		return _task.getDescription();
	}

	/**
	* Sets the description of this task.
	*
	* @param description the description of this task
	*/
	public void setDescription(java.lang.String description) {
		_task.setDescription(description);
	}

	public boolean isNew() {
		return _task.isNew();
	}

	public void setNew(boolean n) {
		_task.setNew(n);
	}

	public boolean isCachedModel() {
		return _task.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_task.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _task.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _task.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_task.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _task.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_task.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TaskWrapper((Task)_task.clone());
	}

	public int compareTo(com.excilys.model.Task task) {
		return _task.compareTo(task);
	}

	@Override
	public int hashCode() {
		return _task.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.excilys.model.Task> toCacheModel() {
		return _task.toCacheModel();
	}

	public com.excilys.model.Task toEscapedModel() {
		return new TaskWrapper(_task.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _task.toString();
	}

	public java.lang.String toXmlString() {
		return _task.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_task.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Task getWrappedTask() {
		return _task;
	}

	public Task getWrappedModel() {
		return _task;
	}

	public void resetOriginalValues() {
		_task.resetOriginalValues();
	}

	private Task _task;
}