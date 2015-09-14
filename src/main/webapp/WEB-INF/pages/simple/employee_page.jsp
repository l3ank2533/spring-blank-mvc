<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<f:form action="${pageContext.request.contextPath}/employee" modelAttribute="employee" method="post">
		<p>Name<span></span>:<f:input path="name"/></p>
		<p>E-mail<span></span>:<f:input path="email"/></p>
		<p><input type="submit" value="submit"/></p>
		
</f:form>

${name}
${email}
