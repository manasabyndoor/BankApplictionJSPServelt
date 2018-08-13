<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div style="align: center;">
	<h1>Details of all customers</h1>
</div>
<table>
<tr>
<th>Customer ID
</th>
<th>
Customer name</th>
<th>
Contact number</th>
<th>email
</th>
<th>
nationality</th>
<th>
balance</th>
<jstl:forEach var="customers" items="${ sessionScope.customers}">
<tr>
<td>${customers.customerId }</td>
<td>${customers.customerName }</td>
<td>${customers.contactNumber }</td>
<td>${customers.emailId }</td>
<td>${customers.nationality }</td>
<td>${customers.balance }


</jstl:forEach>

</tr>
<tr>
</tr>

</table>


</body>
</html>