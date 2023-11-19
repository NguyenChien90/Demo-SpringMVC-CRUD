<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/19/2023
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Creat Product</h1>
<a href="/">Back</a>
<form action="/create" method="post">
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
    <button type="submit">Create</button>

</form>
</body>
</html>
