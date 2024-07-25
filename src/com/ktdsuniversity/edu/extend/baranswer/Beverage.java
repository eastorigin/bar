package com.ktdsuniversity.edu.extend.baranswer;

public class Beverage extends Goods{

	private String beverageName;
	private int beveragePrice;
	private int beverageStock;
	
	public Beverage(String type, String beverageName, int beveragePrice, int beverageStock) {
		super(type);
		this.beverageName = beverageName;
		this.beveragePrice = beveragePrice;
		this.beverageStock = beverageStock;
	}
	
	public int getBeveragePrice() {
		return beveragePrice;
	}
	
	public String getBeverageName() {
		return beverageName;
	}
	
	public int getBeverageStock() {
		return beverageStock;
	}
	
	public void decreaseBeverageStock(int orderNumber) {
		this.beverageStock -= orderNumber;
	}
}
