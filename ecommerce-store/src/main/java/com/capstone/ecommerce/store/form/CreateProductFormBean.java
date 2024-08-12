package com.capstone.ecommerce.store.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class CreateProductFormBean {

    private Integer productId;

    //JSR-303 validation
    @NotEmpty(message="Name is required")
    private String productName;

    @NotEmpty(message="Description is required")
    private String productDescription;

    @NotNull(message = "Price is required")
    private Double buyPrice;

    @NotEmpty(message="Image is required")
    private String imageUrl;

}
