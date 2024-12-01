<%--
  Created by IntelliJ IDEA.
  User: maitr
  Date: 12/2/2024
  Time: 12:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
</head>
<body class="bg-light">

<div class="container my-4">
    <h2 class="text-center text-primary fw-bold display-4 mb-4">Danh Sách Tài Khoản</h2>




    <table class="table table-striped table-bordered">
        <thead class="table-dark">
        <tr>
            <th>Danh Tính</th>
            <th>Mã Tài Khoản</th>
            <th>Tên Đăng Nhập</th>
            <th>Mật Khẩu</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="account" items="${accounts}">
            <tr>
                <td>
                    <c:choose>
                        <c:when test="${account.account_Type_Id == 1}">Customer</c:when>
                        <c:when test="${account.account_Type_Id == 2}">Seller</c:when>
                        <c:otherwise>Admin</c:otherwise>
                    </c:choose>
                </td>
                <td>${account.account_Id}</td>
                <td>${account.account_Name}</td>
                <td>${account.account_Password}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
