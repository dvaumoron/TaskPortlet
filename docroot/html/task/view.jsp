<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.excilys.TaskSearchUtil"%>
<%@ page import="com.liferay.portal.util.PortalUtil"%>

<portlet:defineObjects />

<%
	long taskId = ParamUtil.get(request, "taskId", 0);
	String taskName = ParamUtil.get(request, "taskName", "");
	String taskDescription = ParamUtil.get(request, "taskDescription", "");
	String filter = ParamUtil.get(request, "filter", "");
%>

<portlet:actionURL var="saveURL">
	<portlet:param name="jspPage" value="/view.jsp"/>
</portlet:actionURL>

<aui:form action="<%= saveURL %>" method="post">
	<aui:input name="taskId" type="hidden" value="<%= taskId %>" />
	<aui:input label="nom" name="taskName" type="text" value="<%= taskName %>" />
	<aui:input label="description" name="taskDescription" type="text" value="<%= taskDescription %>" />
	<aui:button type="submit" />
</aui:form>

<portlet:actionURL var="filterURL">
	<portlet:param name="action" value="filter"/>
	<portlet:param name="jspPage" value="/view.jsp"/>
</portlet:actionURL>

<aui:form action="<%= filterURL %>" method="post">
	<aui:input label="filtre" name="filter" type="text" value="<%= filter %>" />
	<aui:button type="submit" />
</aui:form>

<%
long companyId = PortalUtil.getCompanyId(request);
%>

<liferay-ui:search-container delta="10" emptyResultsMessage="no-tasks-were-found">
	<liferay-ui:search-container-results
		results="<%= TaskSearchUtil.search(companyId, filter, searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= TaskSearchUtil.searchCount(companyId, filter) %>"
	/>

	<liferay-ui:search-container-row
		className="com.excilys.model.Task"
		keyProperty="taskId"
		modelVar="task"
	>
		<liferay-ui:search-container-column-text
			name="name"
			value="<%= task.getName() %>"
		/>

		<liferay-ui:search-container-column-text
			name="description"
			property="description"
		/>
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>