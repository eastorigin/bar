package com.ktdsuniversity.edu.extend.baranswer;

public class BarMain {

	public static void main(String[] args) {
		
		/*
		 * 음료와 주류를 파는 바입니다
		 * 음료 혹은 주류를 팔면 바는 돈을 법니다
		 * 19세 미만의 손님에게는 주류를 팔 수 없습니다
		 * 
		 * 바는 여러 개의 음료를 판매할 수 있습니다
		 * 
		 * 추가 구현과제:
		 * 손님이 잔뜩 취했을 경우에는, 주류를 팔지 못합니다
		 */
		
		Beverage water = new Beverage("논알콜", "물", 1000, 20);
		Beverage coke = new Beverage("논알콜", "콜라", 2000, 10);
		Beverage cider = new Beverage("논알콜", "사이다", 2000, 15);
		
		Beverage tequila = new Alcohol("알콜", "데낄라", 17, 9000, 9);
		Beverage cass = new Alcohol("알콜", "카스", 5, 7000, 7);
		Beverage soju = new Alcohol("알콜", "진로 소주", 15, 5000, 6);
		
		Beverage[] beverageArray = {water, coke, cider, tequila, cass, soju};
		
		Bar bar = new Bar(100000, beverageArray);
		
		Guest guest1 = new Guest(2, 1, 22, beverageArray);
		Guest guest2 = new Guest(4, 3, 9, beverageArray);
		Guest guest3 = new Guest(5, 7, 43, beverageArray);
		
		bar.beverageSell("물", guest1);
		bar.beverageSell("데낄라", guest1);
		
		bar.beverageSell("콜라", guest2);
		bar.beverageSell("카스", guest2);
		
		bar.beverageSell("사이다", guest3);
		bar.beverageSell("진로 소주", guest3);
	}
}
