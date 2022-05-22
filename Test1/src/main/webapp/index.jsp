<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:out value="Index page"></c:out>
<%-- <c:redirect url="helloWorld.jsp"></c:redirect> --%>
<logic:redirect forward="helloWorld"/>
