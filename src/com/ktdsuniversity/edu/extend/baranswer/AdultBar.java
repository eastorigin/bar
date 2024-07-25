package com.ktdsuniversity.edu.extend.baranswer;

public class AdultBar extends AbstractBar {
	
	public AdultBar(int barMoney, Beverage[] beverage) {
		super(barMoney, beverage);
	}
	
	@Override
	public boolean checkGuest(Beverage beverage, Guest guest) {
		if(beverage instanceof Alcohol) {
			if(guest.drunkenAlcohol(beverage.getBeverageName())) {
				System.out.println("손님이 잔뜩 취해 있어 더 이상 주류를 판매할 수 없습니다");
				return false;
			}
		}
		return true;
	}
	
	@Override
	public void beverageSell(String beverageName, Guest guest) {
		if(!guest.isAdult()) {
			System.out.println("미성년자는 입장할 수 없습니다");
			return;
		}
		super.beverageSell(beverageName, guest);
	}

}
