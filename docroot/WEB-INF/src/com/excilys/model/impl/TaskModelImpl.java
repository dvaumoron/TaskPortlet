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

package com.excilys.model.impl;

import com.excilys.model.Task;
import com.excilys.model.TaskModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Task service. Represents a row in the &quot;Task_Task&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.excilys.model.TaskModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TaskImpl}.
 * </p>
 *
 * @author denis
 * @see TaskImpl
 * @see com.excilys.model.Task
 * @see com.excilys.model.TaskModel
 * @generated
 */
public class TaskModelImpl extends BaseModelImpl<Task> implements TaskModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a task model instance should use the {@link com.excilys.model.Task} interface instead.
	 */
	public static final String TABLE_NAME = "Task_Task";
	public static final Object[][] TABLE_COLUMNS = {
			{ "taskId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "done", Types.BOOLEAN },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Task_Task (taskId LONG not null primary key,companyId LONG,name VARCHAR(75) null,done BOOLEAN,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Task_Task";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.excilys.model.Task"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.excilys.model.Task"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.excilys.model.Task"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long TASKID_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.excilys.model.Task"));

	public TaskModelImpl() {
	}

	public long getPrimaryKey() {
		return _taskId;
	}

	public void setPrimaryKey(long primaryKey) {
		setTaskId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_taskId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Task.class;
	}

	public String getModelClassName() {
		return Task.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("taskId", getTaskId());
		attributes.put("companyId", getCompanyId());
		attributes.put("name", getName());
		attributes.put("done", getDone());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
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

	public long getTaskId() {
		return _taskId;
	}

	public void setTaskId(long taskId) {
		_columnBitmask |= TASKID_COLUMN_BITMASK;

		if (!_setOriginalTaskId) {
			_setOriginalTaskId = true;

			_originalTaskId = _taskId;
		}

		_taskId = taskId;
	}

	public long getOriginalTaskId() {
		return _originalTaskId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public boolean getDone() {
		return _done;
	}

	public boolean isDone() {
		return _done;
	}

	public void setDone(boolean done) {
		_done = done;
	}

	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Task.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Task toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Task)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		TaskImpl taskImpl = new TaskImpl();

		taskImpl.setTaskId(getTaskId());
		taskImpl.setCompanyId(getCompanyId());
		taskImpl.setName(getName());
		taskImpl.setDone(getDone());
		taskImpl.setDescription(getDescription());

		taskImpl.resetOriginalValues();

		return taskImpl;
	}

	public int compareTo(Task task) {
		long primaryKey = task.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Task task = null;

		try {
			task = (Task)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = task.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		TaskModelImpl taskModelImpl = this;

		taskModelImpl._originalTaskId = taskModelImpl._taskId;

		taskModelImpl._setOriginalTaskId = false;

		taskModelImpl._originalCompanyId = taskModelImpl._companyId;

		taskModelImpl._setOriginalCompanyId = false;

		taskModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Task> toCacheModel() {
		TaskCacheModel taskCacheModel = new TaskCacheModel();

		taskCacheModel.taskId = getTaskId();

		taskCacheModel.companyId = getCompanyId();

		taskCacheModel.name = getName();

		String name = taskCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			taskCacheModel.name = null;
		}

		taskCacheModel.done = getDone();

		taskCacheModel.description = getDescription();

		String description = taskCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			taskCacheModel.description = null;
		}

		return taskCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{taskId=");
		sb.append(getTaskId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", done=");
		sb.append(getDone());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.excilys.model.Task");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>taskId</column-name><column-value><![CDATA[");
		sb.append(getTaskId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>done</column-name><column-value><![CDATA[");
		sb.append(getDone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Task.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Task.class
		};
	private long _taskId;
	private long _originalTaskId;
	private boolean _setOriginalTaskId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private String _name;
	private boolean _done;
	private String _description;
	private long _columnBitmask;
	private Task _escapedModelProxy;
}