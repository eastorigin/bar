package com.ktdsuniversity.edu.extend.bar;

public abstract class AbstractBar {

	protected int barMoney;
	protected Beverage[] beverage;
	protected Alcohol[] alcohol;
	
	public AbstractBar (int barMoney, Beverage[] beverage, Alcohol[] alcohol) {
		this.barMoney = barMoney;
		this.beverage = beverage;
		this.alcohol = alcohol;
	}
	
	public void increaseBeverageBarMoney(String beverageName, int orderNumber) {
		if(beverage != null) { // . 앞에 있는 건 다 null 체크
			for(int i = 0; i < beverage.length; i++) {
				if(beverage[i] != null && beverage[i].getBeverageName() != null) {
					if(beverage[i].getBeverageName().equals(beverageName)) { // null 체크
						this.barMoney += beverage[i].getBeveragePrice() * orderNumber;
					}
				}
			}
		}
	}
	
	public void increaseAlcoholBarMoney(String alcoholName, int orderNumber) {
		if(alcohol != null) {
			for(int i = 0; i < alcohol.length; i++) {
				if(alcohol[i] != null && alcohol[i].getAlcoholName() != null) {
					if(alcohol[i].getAlcoholName().equals(alcoholName)) {
						this.barMoney += alcohol[i].getAlcoholPrice() * orderNumber;
					}
				}
			}
		}
	}
	
	public void beverageSell(String beverageName, Guest guest) {
		if(beverage != null) {
			for(int i = 0; i < beverage.length; i++) {
				if(beverage[i] != null && beverage[i].getBeverageName() != null) {
					if(beverage[i].getBeverageName().equals(beverageName)) {
						int beverageStock = beverage[i].getBeverageStock();
						int guestBeverageOrderNumber = guest.getBeverageOrderNumber();
						if(beverageStock < guestBeverageOrderNumber) {
							guestBeverageOrderNumber = beverageStock;
							beverage[i].decreaseBeverageStock(guestBeverageOrderNumber);
							this.increaseBeverageBarMoney(beverageName, guestBeverageOrderNumber);
							System.out.println("재고가 부족하여 현재 있는 재고만 판매하였습니다");
							return;
						}else {
							beverage[i].decreaseBeverageStock(guestBeverageOrderNumber);
							this.increaseBeverageBarMoney(beverageName, guestBeverageOrderNumber);
							System.out.println("재고가 충분하여 " + beverageName + " " + guestBeverageOrderNumber + "개를 판매하였습니다.");
						}
						System.out.println("현재 바의 돈: " + this.barMoney + "원");
						System.out.println("남은 " + beverageName + " 재고: " + beverage[i].getBeverageStock() + "개");
						return;
					}
				}
			}
		}
	}
	
	public abstract void alcoholSell(String alcoholName, Guest guest);
	
	public void processAlcoholSell(String alcoholName, Guest guest) {
		if(alcohol != null && alcoholName != null) {
			for(int i = 0; i < alcohol.length; i++) {
				if(alcohol[i] != null && alcohol[i].getAlcoholName() != null) {
					if(alcohol[i].getAlcoholName().equals(alcoholName)) {
						if(guest.isAdult() && !guest.isDrunken(alcoholName)) {
							int alcoholStock = alcohol[i].getAlcoholStock();
							int guesetAlcoholOrderNumber = guest.getAlcoholOrderNumber();
							if(alcoholStock < guesetAlcoholOrderNumber) {
								guesetAlcoholOrderNumber = alcoholStock;
								alcohol[i].decreaseAlcoholStock(guesetAlcoholOrderNumber);
								this.increaseAlcoholBarMoney(alcoholName, guesetAlcoholOrderNumber);
								System.out.println("재고가 부족하여 현재 있는 재고만 판매하였습니다");
								return;
							}else {
								alcohol[i].decreaseAlcoholStock(guesetAlcoholOrderNumber);
								this.increaseAlcoholBarMoney(alcoholName, guesetAlcoholOrderNumber);
								System.out.println("재고가 충분하여 " + alcoholName + " " + guesetAlcoholOrderNumber + "개를 판매하였습니다.");
								System.out.println("남은 " + alcoholName + " 재고: " + alcohol[i].getAlcoholStock() + "개");
							}
							System.out.println("현재 바의 돈: " + this.barMoney + "원");
						}else {
							System.out.println("손님이 잔뜩 취해 있어 주류를 판매할 수 없습니다.");
						}
						return;
					}
				}
			}
		}
	}
}
