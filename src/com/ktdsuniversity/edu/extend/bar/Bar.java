package com.ktdsuniversity.edu.extend.bar;

public class Bar {

	private int barMoney;
	private Beverage[] beverage;
	private Alcohol[] alcohol;
	private Guest guest;
	
	public Bar(int barMoney, Beverage[] beverage, Alcohol[] alcohol) {
		this.barMoney = barMoney;
		this.beverage = beverage;
		this.alcohol = alcohol;
	}
	
	public void increaseBeverageBarMoney(String beverageName) {
		for(int i = 0; i < beverage.length; i++) {
			if(beverage[i].getBeverageName().equals(beverageName)) {
				this.barMoney += beverage[i].getBeveragePrice() * guest.getBeverageOrderNumber();
			}
		}
	}
	
	public void increaseAlcoholBarMoney(String alcoholName) {
		for(int i = 0; i < alcohol.length; i++) {
			if(alcohol[i].getAlcoholName().equals(alcoholName)) {
				this.barMoney += alcohol[i].getAlcoholPrice() * guest.getAlcoholOrderNumber();
			}
		}
	}
	
	public void beverageSell(String beverageName) {
		for(int i = 0; i < beverage.length; i++) {
			if(beverage[i].getBeverageName().equals(beverageName)) {
				int beverageStock = beverage[i].getBeverageStock();
				int guestBeverageOrderNumber = guest.getBeverageOrderNumber();
				if(beverageStock < guestBeverageOrderNumber) {
					guestBeverageOrderNumber = beverageStock;
					beverage[i].decreaseBeverageStock();
					this.increaseBeverageBarMoney(beverageName);
					System.out.println("재고가 부족하여 현재 있는 재고만 판매하였습니다");
					return;
				}else {
					beverage[i].decreaseBeverageStock();
					this.increaseBeverageBarMoney(beverageName);
					return;
				}
			}
		}
	}
	
	public void alcoholSell(String alcoholName) {
		for(int i = 0; i < alcohol.length; i++) {
			if(alcohol[i].getAlcoholName().equals(alcoholName)) {
				if(guest.isAdult() && !guest.isDrunken(alcoholName)) {
					int alcoholStock = alcohol[i].getAlcoholStock();
					int guusetAlcoholOrderNumber = guest.getAlcoholOrderNumber();
					if(alcoholStock < guusetAlcoholOrderNumber) {
						guusetAlcoholOrderNumber = alcoholStock;
						alcohol[i].decreaseAlcoholStock();
						this.increaseAlcoholBarMoney(alcoholName);
						System.out.println("재고가 부족하여 현재 있는 재고만 판매하였습니다");
						return;
					}else {
						alcohol[i].decreaseAlcoholStock();
						this.increaseAlcoholBarMoney(alcoholName);
						return;
					}
				}
			}
		}
	}
}
