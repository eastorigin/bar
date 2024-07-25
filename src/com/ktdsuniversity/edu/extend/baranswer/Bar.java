package com.ktdsuniversity.edu.extend.baranswer;

public class Bar extends AbstractBar{
	
	public Bar(int barMoney, Beverage[] beverage) {
		super(barMoney, beverage);
	}
	
	@Override
	public boolean checkGuest(Beverage beverage, Guest guest) {
		if(beverage instanceof Alcohol) {
			if(!guest.isAdult()) {
				System.out.println("미성년자에게는 주류를 판매할 수 없습니다");
				return false;
			}
		}
		return true;
	}
}
