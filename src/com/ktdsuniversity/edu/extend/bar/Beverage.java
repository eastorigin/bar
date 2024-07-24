package com.ktdsuniversity.edu.extend.bar;

public class Beverage extends Goods{

	private String beverageName;
	private int beveragePrice;
	private int beverageStock;
	private Guest guest;
	
	public Beverage(String type, String beverageName, int beveragePrice, int beverageStock) {
		super(type);
		this.beverageName = beverageName;
		this.beveragePrice = beveragePrice;
		this.beverageStock = beverageStock;
	}
	
	public int getBeveragePrice() {
		return beveragePrice;
	}
	
	public void decreaseBeverageStock() {
		this.beverageStock -= this.guest.getOrderNumber();
	}
	
	public void beverageSell() {
		
	}
}
