<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/19/2023
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Delete</title>
</head>
<body>
<a href="/">Back</a>
<form action="/delete/${product.productId}" method="post">
    <label>STT
    </label>
    <input type="text" name="id" value="${product.productId}" hidden>
    <label>NAME</label>
    <input type="text" name="name" value="${product.productName}" hidden>
    <label>CATALOG</label>
    <input type="text" name="catalog" value="${product.catalogName}" hidden>
    <label>DESCRIPTION</label>
    <input type="text" name="des" value="${product.description}" hidden>
    <label>PRICE</label>
    <input type="number" name="price" value="${product.price}" hidden>
    <label>STATUS</label>
    <input type="text" name="status" value="${product.status}" hidden>
    <label>Ban co muon xoa ?</label>
    <button type="submit">Yes</button>
</form>
</body>
</html>
