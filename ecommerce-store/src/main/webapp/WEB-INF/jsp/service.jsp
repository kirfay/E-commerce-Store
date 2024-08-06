<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kiranfayyaz
  Date: 8/5/24
  Time: 8:42 AM
  To change this template use File | Settings | File Templates.
--%>
<jsp:include page="include/header.jsp" />

<!-- a page header -->
<section style="background-color:pink">
    <div class="container">
        <div class="row pt-5 pb-5">
            <h1 class="text-center">Services Page</h1>
        </div>
    </div>
</section>

<!-- a search form -->
<section>
    <div class="container">
        <div class="row justify-content-center pt-5 pb-3">
            <div class="col-8 text-center">
                <form action="/services">
                    <div class="mb-3">
                        <label for="services" class="form-label"><h4>Find Services</h4></label>
                        <input type="text" value="${services}" class="form-control" id="services" name="services" placeholder="Enter search term"/>
                    </div>
                    <button type="submit" class="btn btn-primary">Find Services</button>
                </form>
            </div>
        </div>
    </div>
</section>

<section>
    <div class="container">
        <div class="row pt-5">
            <div class="col-12">
                <h2 class="text-center">Products Found (${products.size()})</h2>
            </div>
        </div>
        <div class="row pt-3">
            <div class="col-12">
                <table class="table">
                    <tr>
                        <th>id</th>
                        <th>code</th>
                        <th>name</th>
                        <th>description</th>
                        <th>edit</th>
                    </tr>
                    <c:forEach items="${products}" var="product">
                        <tr>
                            <td><a> href="/?id=${product.id}"</a></td>
                            <td>${product.productCode}</td>
                            <td>${product.productName}</td>
                            <td>${product.productDescription}</td>
                            <td><a> href="/?id=${product.id}">Edit</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</section>

<jsp:include page="include/footer.jsp" />

