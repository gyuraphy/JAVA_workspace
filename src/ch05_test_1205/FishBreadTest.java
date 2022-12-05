package ch05_test_1205;

public class FishBreadTest {

	public static void main(String[] args) {
		// 클래스명 참조변수(객체이름) = new 클래스명();
		FishBread fishBread1 = new FishBread();
		// 기본 생성자 : FishBread();
		// 해당 변수에 처음 값을 할당하는 역할, 초기화
		// 변수, dough : String, redBean : String
		// 기본적으로 값을 할당 하지 않아서, 기본값이 null -> 해당 참조형(주소 값) 할당이 안되었음.
		fishBread1.setDough("cdg 기법의 반죽");
		fishBread1.setRedBean("흑설탕을 추가한 팥");
		fishBread1.showInfo();
		
		FishBread fishBread2 = new FishBread("밀가루2","단팥");

	}

}
