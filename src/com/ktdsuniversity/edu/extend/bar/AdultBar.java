package com.ktdsuniversity.edu.extend.bar;

public class AdultBar extends AbstractBar{
	
	public AdultBar(int barMoney, Beverage[] beverage, Alcohol[] alcohol) {
		super(barMoney, beverage, alcohol);
	}
	
	@Override
	public void alcoholSell(String alcoholName, Guest guest) {
		if(guest != null) {
			if(!guest.isAdult()) {
				System.out.println("성인만 입장 가능합니다");
				return;
			}
			processAlcoholSell(alcoholName, guest);
		}
	}
}
