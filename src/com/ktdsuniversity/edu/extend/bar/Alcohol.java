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
	
	public void alcoholSell(int alcoholOrderNumber) {
		if(this.guest.getAge() < 19) {
			System.out.println("19세 미만의 손님에게는 주류를 판매할 수 없습니다");
		}else if(this.guest.isDrunken(name)) {
			System.out.println("손님께서 취하셔서 주류를 팔지 못합니다");
		}else {
			this.decreaseAlcoholStock(alcoholOrderNumber);
		}
	}
	
	public void decreaseAlcoholStock(int alcoholOrderNumber) {
		this.alcoholStock -= alcoholOrderNumber;
	}
	
}
