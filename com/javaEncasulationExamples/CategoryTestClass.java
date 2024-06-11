package com.javaEncasulationExamples;

public class CategoryTestClass
{

	public static void main(String[] args)
	{
		
		
		
		Category c1 = new Category(1001, "Electronics");
		System.out.println(c1.getItemCategoryId());
		System.out.println(c1.getItemCategoryName());
		
		System.out.println("----------------------");
		
		c1.setItemCategoryName("Cloths");
		
		System.out.println(c1.getItemCategoryId());
		System.out.println(c1.getItemCategoryName());
		
		System.out.println("----------------------");
		
		
		
	}

}
