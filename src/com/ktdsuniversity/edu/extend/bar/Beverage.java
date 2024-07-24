package com.ktdsuniversity.edu.extend.bar;

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
}
