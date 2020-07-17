<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false"%>
<%@taglib uri="http://java.sun.com/portlet" prefix="portlet"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<portlet:defineObjects />

<h1 align="center">Register Page</h1>

<portlet:actionURL var="registerActionURL">
	<portlet:param name="registerNmae" value="registerValue"/>
</portlet:actionURL>
<h4 align="center">!!!!!!!!! OM NAMASHIVAYA !!!!!!!!!</h4>
<form:form action="${registerActionURL}" commandName="registerBean">
	<table align="center">
	  <tr>
	    <td>UserName</td>
	    <td><form:input path="userName"/></td>
	  </tr>
	  <tr>
	    <td>Password</td>
	    <td><form:password path="password"/></td>
	  </tr>
	  <tr>
	    <td>ConfirmPassword</td>
	    <td><form:password path="confirmPassword"/></td>
	  </tr>
	  <tr>
	    <td>Gender</td>
	    <td>
	    	<form:radiobutton path="gender" value="male"/>Male
			<form:radiobutton path="gender" value="female"/>FeMale
		</td>
	  </tr>
	  <tr>
	    <td>Mail</td>
	    <td><form:input path="mail"/></td>
	  </tr>
	  <tr>
	    <td>Contact</td>
	    <td><form:input path="contact"/></td>
	  </tr>
	  <tr>
	    <td><input type="submit" value="Register"></td> 
	     <td><input type="reset" value="Reset"></td>
	  </tr>
	</table>
</form:form>
