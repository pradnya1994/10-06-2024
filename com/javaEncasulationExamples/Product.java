package com.javaEncasulationExamples;

public class Product 
{
	
	//fields
	private int productId;
	private String productName;
	private double productPrice;
	private String productCategory;
	
	//Initializer methods 
	public Product() 
	{
		
	}

	public Product(int productId, String productName, double productPrice, String productCategory) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}

	
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	//methods
	public void getProductDetails()
	{
		System.out.println(productId);		System.out.println(productName);
		System.out.println(productPrice);
		System.out.println(productCategory);
	}

}
