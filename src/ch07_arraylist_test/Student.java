package ch07_arraylist_test;

import java.util.ArrayList;

import ch07_arraylist_test.Menu;

public class Student {
	// 인스턴스 변수(객체) 생성
	int stuID; // 학생번호
	String stuName; // 학생이름
	int stuMoney; // 용돈
	
	// 배열 Menu형에 lcnchMenu 선언;
	ArrayList<Menu> LunchMenu;
	
	// 메뉴추가하기
	public void addMenu(String mName, int mPrice, String mInfo) {
		Menu menu = new Menu();
		menu.setmName(mName);
		menu.setmPrice(mPrice);
		menu.setmDescription(mInfo);
		LunchMenu.add(menu);
	}
	
	// 매개변수가 2개(학생번호, 학생이름, 용돈)인 생성자
	public Student(int stuID, String stuName, int stuMoney) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuMoney = stuMoney;
	}

	// 매개변수가 2개(학생번호, 학생이름)인 생성자
	public Student(int stuID, String stuName) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
	}
	
	// 출력 검사
	public void stuInfo() {
		int total = 0;
		
		for (Menu menu : LunchMenu) {

			System.out.println("학생 " + stuName + "의 " + " 점심메뉴 : " + menu.getmName() + " 가격 : " + menu.getmPrice()
					+ "원 간단 위치 : " + menu.getmDescription() + "입니다.");
		}
	}
}
