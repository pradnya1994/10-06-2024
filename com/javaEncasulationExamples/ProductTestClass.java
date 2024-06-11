package com.javaEncasulationExamples;

public class ProductTestClass
{

	public static void main(String[] args)
	{
		
		Product product1 = new Product(1019, "HP Laptop", 90876.45, "Electronics");
		product1.getProductDetails();
		
		System.out.println("----------------------");
		
		
		product1.setProductPrice(76543.34);
		
		product1.getProductDetails();
		
	}

}
