package com.rajtech;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Product {
	@NotNull (message="Product Id is required")
	private Integer pid;
	@NotNull (message="Product Name is required")
	@Size(min=3, max=10)
	private String pname;
	@NotNull (message="Product Price is required")
	private Integer price;
}
