<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page import="com.bank.pojo.Customer"  %>
<!DOCTYPE html>
<html>
<head>
<%-- <% Customer customer = (Customer)request.getAttribute("Customer");%> --%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4>Balance=</h4>${ sessionScope.Balance }

</body>
</html>