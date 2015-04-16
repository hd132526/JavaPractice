/**
 * 
 */
package org.dimigo.oop;

/**
	JavaPractice 
	-org.dimigo.oop 
	--Car2.java
	@date : 2015. 4. 16.
	@author : ÀÌ½ÂÇö
	@version : 1.0
 */
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		this.company = newCompany;
		this.model = newModel;
		this.color = newColor;
		this.maxSpeed = newMaxSpeed;
		this.price = newPrice;
	}
	public Car3(String newCompany, String newModel, String newColor, int newMaxSpeed) {
		this.company = newCompany;
		this.model = newModel;
		this.color = newColor;
		this.maxSpeed = newMaxSpeed;
		this.price = 0;
	}
	public Car3(String newCompany, String newModel, String newColor) {
		this.company = newCompany;
		this.model = newModel;
		this.color = newColor;
		this.maxSpeed = 0;
		this.price = 0;
	}
	
	
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	
}
