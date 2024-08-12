<%--
  Created by IntelliJ IDEA.
  User: kiranfayyaz
  Date: 8/8/24
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="../include/header.jsp" />

Add <a href="admin/createproduct"></a>


<table class="table">

    private String productCode;

    //JSR-303 validation
    @NotEmpty(message="Name is required.")
    private String productName;

    private String productDescription;

    private Double buyPrice
    <thead>
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Code</th>
        <th scope="col">Service Type</th>
        <th scope="col">Description</th>
        <th scope="col">Price</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>1</td>
        <td>CopyWriting Service</td>
        <td>SEO Product Copywriting Service</td>
        <td>10.00</td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>2</td>
        <td>Thornton</td>
        <td>@fat</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td colspan="2">Larry the Bird</td>
        <td>@twitter</td>
    </tr>
    </tbody>
</table>



<jsp:include page="../include/footer.jsp" />

