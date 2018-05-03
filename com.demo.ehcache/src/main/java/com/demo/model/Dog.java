package com.demo.model;

public class Dog {

	private Long weight;
	private String category;
	private Short height;
	
	public Dog(Long weight, String category, Short height) {
		super();
		this.weight = weight;
		this.category = category;
		this.height = height;
	}
	public Long getWeight() {
		return weight;
	}
	public void setWeight(Long weight) {
		this.weight = weight;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Short getHeight() {
		return height;
	}
	public void setHeight(Short height) {
		this.height = height;
	}
	
	
}
