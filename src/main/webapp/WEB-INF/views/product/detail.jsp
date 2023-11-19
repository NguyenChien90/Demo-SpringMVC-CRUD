<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 11/19/2023
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Detail Product</title>
</head>
<body>
<a href="/">Back</a>
<h2>Name        : ${product.productName}</h2>
<h2>Catalog     : ${product.catalogName}</h2>
<h2>Description : ${product.description}</h2>
<h2>Price       : ${product.price} $</h2>
<h2>Status      : ${product.status? "Con hang" : "Het hang"}</h2>
</body>
</html>
