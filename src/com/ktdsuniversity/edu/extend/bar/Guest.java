package com.ktdsuniversity.edu.extend.bar;

public class Guest {

	private int beverageOrderNumber;
	private int alcoholOrderNumber;
	private int age;
	private Alcohol[] alcohol;
	
	public Guest(int beverageOrderNumber, int alcoholOrderNumber, int age, Alcohol[] alcohol, Beverage[] beverage) {
		this.beverageOrderNumber = beverageOrderNumber;
		this.alcoholOrderNumber = alcoholOrderNumber;
		this.alcohol = alcohol;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getBeverageOrderNumber() {
		return beverageOrderNumber;
	}
	
	public int getAlcoholOrderNumber() {
		return alcoholOrderNumber;
	}
	
	public boolean isDrunken(String alcoholName) {
		for(int i = 0; i < alcohol.length; i++) {
			if(alcohol[i].getAlcoholName().equals(alcoholName)) {
				return alcohol[i].getAlcoholDegree() * this.alcoholOrderNumber > 44;
			}
		}
		return false;
	}
	
	public boolean isAdult() {
		return this.age >= 19;
	}
}
