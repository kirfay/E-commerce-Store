package com.capstone.ecommerce.store.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CreateProductFormBean {

    private Integer productId;

    private String productCode;

    //JSR-303 validation
    @NotEmpty(message="Name is required.")
    private String productName;

    private String productDescription;

    private Double buyPrice;

}
