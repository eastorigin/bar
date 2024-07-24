package com.ktdsuniversity.edu.extend.bar;

public class Guest {

	private int beverageOrderNumber;
	private int alcoholOrderNumber;
	private int age;
	private Alcohol[] alcohol;
	private Beverage[] beverage;
	
	public Guest(int beverageOrderNumber, int alcoholOrderNumber, int age, Alcohol[] alcohol, Beverage[] beverage) {
		this.beverageOrderNumber = beverageOrderNumber;
		this.alcoholOrderNumber = alcoholOrderNumber;
		this.alcohol = alcohol;
		this.age = age;
		this.beverage = beverage;
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
				if(alcohol[i].getAlcoholDegree() * this.alcoholOrderNumber > 44) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	
	public boolean isAdult() {
		if(this.getAge() >= 19) {
			return true;
		}else {
			return false;
		}
	}
	
	public void order() {
		
	}
}
