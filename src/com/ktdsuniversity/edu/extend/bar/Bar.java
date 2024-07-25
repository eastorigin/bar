package com.ktdsuniversity.edu.extend.bar;

public class Bar extends AbstractBar{
	
	/*
	 * 1. 성인들만 이용할 수 있는 바
	 *		- 이용하는 모두가 성인이다 (가정)
	 *		- 자유롭게 주류를 주문
	 * 2. 모든 연령대가 이요할 수 있는 바
	 * 		- 주류를 사려면 반드시 성인이어야 한다
	 * 		- 자유롭게 주류를 주문할 수 없음
	 */
	public Bar(int barMoney, Beverage[] beverage, Alcohol[] alcohol) {
		super(barMoney, beverage, alcohol);
	}
	@Override
	public void alcoholSell(String alcoholName, Guest guest) {
		processAlcoholSell(alcoholName, guest);
	}
}
