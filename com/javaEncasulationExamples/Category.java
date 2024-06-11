package com.javaEncasulationExamples;

public class Category 
{
	
	private int itemCategoryId;
	private String itemCategoryName;
	
	public Category()
	{
		
	}

	public Category(int itemCategoryId, String itemCategoryName) {
		this.itemCategoryId = itemCategoryId;
		this.itemCategoryName = itemCategoryName;
	}
	
	
	//setters and getters
	public int getItemCategoryId() {
		return itemCategoryId;
	}

	public void setItemCategoryId(int itemCategoryId) {
		this.itemCategoryId = itemCategoryId;
	}

	public String getItemCategoryName() {
		return itemCategoryName;
	}

	public void setItemCategoryName(String itemCategoryName) {
		this.itemCategoryName = itemCategoryName;
	}

	
}
