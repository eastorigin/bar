package com.ktdsuniversity.edu.extend.bar;

public class Alcohol extends Goods{

	private String alcoholName;
	private int alcoholDegree;
	private int alcoholPrice;
	private int alcoholStock;
	private Guest guest;
	private Bar bar;
	
	public Alcohol(String type, String alcoholName, int alcoholDegree, int alcoholPrice, int alcoholStock) {
		super(type);
		this.alcoholName = alcoholName;
		this.alcoholDegree = alcoholDegree;
		this.alcoholPrice = alcoholPrice;
		this.alcoholStock = alcoholStock;
	}
	
	public String getAlcoholName() {
		return alcoholName;
	}
	
	public int getAlcoholDegree() {
		return alcoholDegree;
	}
	
	public int getAlcoholPrice() {
		return alcoholPrice;
	}
	
	public int getAlcoholStock() {
		return alcoholStock;
	}
	
	public void decreaseAlcoholStock() {
		this.alcoholStock -= guest.getAlcoholOrderNumber();
	}
	
}
