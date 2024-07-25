package com.ktdsuniversity.edu.extend.baranswer;

public class Guest {

	private int beverageOrderNumber;
	private int alcoholOrderNumber;
	private int age;
	
	/**
	 * 게스트가 마신 음료들.
	 */
	private Beverage[] beverage;
	
	public Guest(int beverageOrderNumber, int alcoholOrderNumber, int age, Beverage[] beverage) {
		this.beverageOrderNumber = beverageOrderNumber;
		this.alcoholOrderNumber = alcoholOrderNumber;
		this.beverage = beverage;
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
	
	public boolean drunkenAlcohol(String alcoholName) {
		for(int i = 0; i < this.beverage.length; i++) {
			
			if (this.beverage[i] instanceof Alcohol) {
				Alcohol alcohol = (Alcohol) this.beverage[i];
				if(alcohol.getBeverageName().equals(alcoholName)) {
					return alcohol.getAlcoholDegree() * this.alcoholOrderNumber > 44;
				}
			}
			
		}
		return false;
	}
	
	public boolean isAdult() {
		return this.age >= 19;
	}
}
