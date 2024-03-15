package com.javaSerializationAndDeSerilization;

import java.io.Serializable;

public class Product implements Serializable
{
	
	private static final long serialVersionUID = 4904L;
	
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() 
	{
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
	
}
