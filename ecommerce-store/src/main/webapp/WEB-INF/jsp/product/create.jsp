<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: kiranfayyaz
  Date: 8/6/24
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../include/header.jsp"/>


<section style="background-color:gray">
    <div class="container">
        <div class="row pt-5 pb-5">
            <c:if test="${empty form.employeeId}">
                <h1 class="text-center">Create Product</h1>
            </c:if>
            <c:if test="${not empty form.employeeId}">
                <h1 class="text-center">Edit Product</h1>
            </c:if>
        </div>
    </div>
</section>


