package com.ktdsuniversity.edu.extend.baranswer;

public abstract class AbstractBar {

	protected int barMoney;
	protected Beverage[] beverage;
	
	public AbstractBar (int barMoney, Beverage[] beverage) {
		this.barMoney = barMoney;
		this.beverage = beverage;
	}
	
	public void increaseBeverageBarMoney(String beverageName, int orderNumber) {
		for(int i = 0; i < beverage.length; i++) {
			if(beverage[i].getBeverageName().equals(beverageName)) {
				this.barMoney += beverage[i].getBeveragePrice() * orderNumber;
			}
		}
	}
	
	public void beverageSell(String beverageName, Guest guest) {
		for(int i = 0; i < beverage.length; i++) {
			if(beverage[i].getBeverageName().equals(beverageName)) {
				if(!checkGuest(beverage[i], guest)) {
					return;
				}
				
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
	
	public abstract boolean checkGuest(Beverage beverage, Guest guest);
}
