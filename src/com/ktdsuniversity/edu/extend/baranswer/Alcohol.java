package com.ktdsuniversity.edu.extend.baranswer;

public class Alcohol extends Beverage { 

	private int alcoholDegree;
	
	public Alcohol(String type, String alcoholName, int alcoholDegree, int alcoholPrice, int alcoholStock) {
		super(type, alcoholName, alcoholPrice, alcoholStock);
		this.alcoholDegree = alcoholDegree;
	}
	
	public int getAlcoholDegree() {
		return alcoholDegree;
	}
	
}
