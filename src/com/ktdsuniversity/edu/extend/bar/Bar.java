package com.ktdsuniversity.edu.extend.bar;

public class Bar {

	private int barMoney;
	private Beverage beverage;
	private Alcohol alcohol;
	private Guest guest;
	
	public Bar(int barMoney, Beverage beverage) {
		this.barMoney = barMoney;
		this.beverage = beverage;
	}
	
	public void increaseBeverageBarMoney() {
		this.barMoney += this.beverage.getBeveragePrice() * this.guest.getOrderNumber();
	}
	
	public void increaseAlcoholBarMoney() {
		this.barMoney += this.alcohol.getAlcoholPrice() * this.guest.getOrderNumber();
	}
}
