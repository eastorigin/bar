package com.ktdsuniversity.edu.extend.bar;

public class Guest {

	private int orderNumber;
	private int age;
	private Alcohol[] alcohol;
	
	public Guest(int orderNumber, Alcohol[] alcohol) {
		this.orderNumber = orderNumber;
		this.alcohol = alcohol;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}
	
	public void isDrunken(String alcoholName) {
		boolean isDrunken = false;
		for(int i = 0; i < alcohol.length; i++) {
			if(alcohol[i].getAlcoholName().equals(alcoholName)) {
				if(alcohol[i].getAlcoholDegree() * this.orderNumber > 44) {
					isDrunken = true;
					return;
				}
			}
		}
	}
}
