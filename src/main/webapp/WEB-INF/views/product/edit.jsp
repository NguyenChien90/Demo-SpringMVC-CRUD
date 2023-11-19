<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/19/2023
  Time: 1:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Form Edit</title>
</head>
<body>
<a href="/">Back</a>
<form action="/update/${product.productId}" method="post">
    <label>STT
    </label>
    <input type="text" name="id" value="${product.productId}" hidden>
    <label>NAME</label>
    <input type="text" name="name" value="${product.productName}" >
    <label>CATALOG</label>
    <input type="text" name="catalog" value="${product.catalogName}" >
    <label>DESCRIPTION</label>
    <input type="text" name="des" value="${product.description}" >
    <label>PRICE</label>
    <input type="number" name="price" value="${product.price}" >
    <label>STATUS</label>
    <input type="text" name="status" value="${product.status}" >
    <button type="submit">Update</button>
</form>
</body>
</html>
