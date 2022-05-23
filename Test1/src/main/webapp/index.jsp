<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<c:out value="Choose :  "></c:out>
<%-- <c:redirect url="helloWorld.jsp"></c:redirect> --%>

  <h1> <html:link href="helloWorld.do?parameter=create">Create </html:link></h1>
	 
	<h1><html:link href="helloWorld.do?parameter=update">Update </html:link></h1>
	
	<h1><html:link href="helloWorld.do?parameter=delete">Delete </html:link></h1>