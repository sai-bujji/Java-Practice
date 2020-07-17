<%@page session="false" contentType="text/html" pageEncoding="ISO-8859-1" import="java.util.*,javax.portlet.*,com.ibm.shivaya.*" %>
<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>        
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>      
<portlet:defineObjects/>
<fmt:setBundle basename="com.ibm.shivaya.nl.ShivayaPortletResource"/>
<portlet:actionURL var="loginActionURL">
	<portlet:param name="loginActionName" value="loginActionValue"/>
</portlet:actionURL>
<h4 align="center">!!!!!!!!! OM NAMASHIVAYA !!!!!!!!!</h4>
<form:form action="${loginActionURL}" commandName="userBean">
<span style="color:red'; text-align: center">${message}</span>
	<table align="center">
	  <tr>
	    <td>UserName</td>
	    <td><form:input path="userName"/></td>
	    <td><span style="color:red"><form:errors path="userName"/></span></td>
	  </tr>
	  <tr>
	    <td>Password</td>
	    <td><form:password path="password"/></td>
	    <td><span style="color:red"><form:errors path="password"/></span></td>
	  </tr>
	  <tr>
	    <td><input type="submit" value="Login"></td> 
	     <td><input type="reset" value="Reset"></td>
	  </tr>
	</table>
</form:form>
<a href="<portlet:renderURL><portlet:param name="resgisterview" value="resgisterview"/></portlet:renderURL>">Click here to register</a>
