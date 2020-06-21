<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.codegym.Customer" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display com.codegym.Customer List</title>
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">--%>
    <style>
        table, tr, th, td{
            border: 1px solid black;
            border-collapse: collapse;
            padding: 5px;
            margin: 5px;
        }
        img{
            width: 100px;
            height: 100px;
        }
        body{
            text-align: center;
            width: 33%;
        }

    </style>
</head>
<body>
<h2>Danh sách khách hàng</h2>
<%--<%--%>
<%--    List<Customer> list = new ArrayList<>();    --%>
<%--    list = (List<Customer>) request.getAttribute("customers");--%>
<%--%>--%>

<table>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
<%--        <% for(int i = 0; i < list.size(); i++){%>--%>
<%--        <tr>--%>
<%--            <td><%=list.get(i).getName()%></td>--%>
<%--        </tr>--%>
<%--        <%--%>
<%--            }--%>
<%--        %>--%>
    <c:forEach var="cus" items='${requestScope["customers"]}'>
        <tr>
            <td><c:out value="${cus.name}"/></td>
            <td><c:out value="${cus.birthday}"/></td>
            <td><c:out value="${cus.address}"/></td>
            <td><img src="${cus.image}" alt="err"></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
