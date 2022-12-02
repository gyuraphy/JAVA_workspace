package ch02_1017;

public class Variable1 {

	public static void main(String[] args) {

		int level;              // 정수형 변수 level을 선언
		level = 10;		// level 변수에 10을 대입
		// 초기화 : 최초의 변수에 값을 할당 하는 것.
		byte b1 = 12; // 변수를 선언과 동시에 값을 할당.
		
		// 기본 데이터 타입 primitive type ,
		// 기본 타입을 제외한 나머지를 참조형 타입이라 한다.(주로 참조형을 많이 사용)
		// 참조형 타입 : 클래스 타입.
		// class Person
		// 참조형 타입으로 선언하게 되면
		// Persion p1: tjsdjs aks.
		// p1 = new Person(); 기본 생성자 호출.
		// 생성자의 역할은 값을 초기화 하는 역할.
		
		System.out.println(level);
		System.out.println("내용 테스트 중");
		System.out.println("단축키 설정이 잘 되었음");
		System.out.println("간혹 단축키 설정이 안된다면 설정에서 추가해주기.");
		// 참고 블로그 사이트
		// https://velog.io/@susu1991/java-%EC%8B%A4%ED%96%89-%EB%8B%A8%EC%B6%95%ED%82%A4%EA%B0%80-%EC%95%88%EB%A8%B9%ED%9E%90-%EB%95%8C
		int #h = 3; // 특수문자는 $, _ 만 사용 가능
		int 한글 = 3; // 한글 사용을 자제
		int int; // 예약어 사용 불가능
		// int i = 10000000000;
		// 해당 데이터 타입의 메모리 크기 및 공간에 대해 암기 할 필요 없음.
		// 컴파일러가 알아서 1차 문법 검사
	}

}
