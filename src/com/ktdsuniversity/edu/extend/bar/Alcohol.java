package com.ktdsuniversity.edu.extend.bar;

public class Alcohol extends Goods{

	private String alcoholName;
	private int alcoholDegree;
	private int alcoholPrice;
	private int alcoholStock;
	
	public Alcohol(String type, String alcoholName, int alcoholDegree, int alcoholPrice, int alcoholStock) {
		super(type);
		this.alcoholName = alcoholName;
		this.alcoholDegree = alcoholDegree;
		this.alcoholPrice = alcoholPrice;
		this.alcoholStock = alcoholStock;
	}
	
	public boolean isDrunken(int alcoholDegree, int orderNumber) {
		if(this.alcoholDegree * orderNumber > 50) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
