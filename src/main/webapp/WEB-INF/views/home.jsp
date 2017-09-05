<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="common/common_head.jsp"/>
<img src="<%=application.getContextPath()%>/resources/img/loading.gif" alt="" /> 
<script>
app.path.init("<%=application.getContextPath()%>");
location.href='<%=application.getContextPath() %>/auth/login_view';
</script>
