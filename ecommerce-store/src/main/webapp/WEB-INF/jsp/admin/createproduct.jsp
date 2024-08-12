<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp" />

<h1>
    Create Product
</h1>


    <div class="container">
        <form action ="/product/createSubmit">
            <input type="hidden" name="id" value="${form.id}">
            <div class="row pt-5">
                <div class="col-6">
                    <div class="mb-3">
                        <label for="exampleInputName" class="form-label">Name</label>
                        <input type="text" class="form-control" id="exampleInputName" value="${form.name}">
                    </div>
                </div>
            </div>
            <c:if test="${bindingResult.hasFieldErrors('name')}">
            <div class="row">
                <div class="col-6 mb-3">
                    <div class="text-danger">
                        <c:forEach items="${bindingResult.getFieldErrors('name')}" var="error">
                            ${error.defaultMessage}<br>
                        </c:forEach>
                    </div>
                </div>
            </div>
            </c:if>

            <div class="row">
                <div class="col-6">
                    <div class="mb-3">
                        <label for="exampleInputDescription" class="form-label">Description</label>
                        <input type="text" name="description" class="form-control" id="exampleInputDescription" value="${form.description}">
                    </div>>
                    </div>
                </div>
            <c:if test="${bindingResult.hasFieldErrors('description')}">
                <div class="row">
                    <div class="col-6 mb-3">
                        <div class="text-danger">
                            <c:forEach items="${bindingResult.getFieldErrors('description')}" var="error">
                                ${error.defaultMessage}<br>
                            </c:forEach>
                        </div>
                    </div>
                </div>
            </c:if>

            <div class="row">
                <div class="col-6">
                    <div class="mb-3">
                        <label for="exampleInputPrice" class="form-label">Price</label>
                        <input type="text" name="price" class="form-control" id="exampleInputPrice">
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-6">
                    <div class="mb-3">
                        <label for="exampleInputImageURL" class="form-label">Image URL</label>
                        <input type="text" name="imageUrl" class="form-control" id="exampleInputImageUrl">
                    </div>
                </div>
            </div>

            <div class="row pt-3">
                <div class="col-6">
                    <button type="submit" class="btn btn-primary">Save Product</button>
                </div>
            </div>

        </form>
    </div>
</form>



<jsp:include page="../include/footer.jsp" />