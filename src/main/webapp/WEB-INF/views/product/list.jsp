<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/18/2023
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>LIST PRODUCT</h1>
<a href="/create">Create Product</a>
<table border="1", style="width: 100%">
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>CATALOG</td>
        <td>DESCRIPTION</td>
        <td>PRICE</td>
        <td>STATUS</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${listProduct}" var="pro">
        <tr>
            <td>${pro.productId}</td>
            <td><a href="/${pro.productId}">${pro.productName}</a></td>
            <td>${pro.catalogName}</td>
            <td>${pro.description}</td>
            <td>${pro.price}</td>
            <td>${(pro.status ? "Con hang": "Het hang")}</td>
            <td><a href="update/${pro.productId}">Edit</a></td>
            <td><a href="delete/${pro.productId}">Delete</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
