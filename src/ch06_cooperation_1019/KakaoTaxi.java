package ch06_cooperation_1019;

public class KakaoTaxi {
	int cTaxiNumber; //택시 넘버
	int passengerCount; // 승객 수
	int money;
	
	public KakaoTaxi(int cTaxiNumber) {
		this.cTaxiNumber = cTaxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("카카오택시 " + cTaxiNumber + "번의 승객은" + passengerCount +"명이고, 수입은 " + money + "입니다.");
	}
}
