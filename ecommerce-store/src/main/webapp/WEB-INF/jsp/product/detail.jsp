<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kiranfayyaz
  Date: 8/5/24
  Time: 8:42 AM
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="../include/header.jsp" />

<div class="container">
    <h1 class="text-center my-4"> Here are details of some of the services we offer </h1>

    <table class="table">

        <tr><td>ID</td><td>${productKey.id}</td></tr>

        <tr><td>Code</td><td>${productKey.productCode}</td></tr>

        <tr><td>Service Type</td><td>${productKey.productName}</td></tr>

        <tr><td>Description</td><td>${productKey.productDescription}</td></tr>

    </table>
</div>

<jsp:include page="../include/footer.jsp" />

