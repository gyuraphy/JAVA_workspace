package ch13_lambda_1025;

public class TestMyNumber {

	public static void main(String[] args) {
		// 람다식을 사용한다는 것(메서드를 사용한다.)
		// 일반 메서드보다 가독성이 좋다.
		// 그런데, 람다식을 사용하려고 보니, 이름이 없기에 해당 인터페이스에 예를 들어
		// 메서드가 2개이면, 람다식으로 어느 메서드를 선택해 사용할지 모름
		// annotation 으로 함수형 인터페이스를 선언해서, 컴파일러에게 알려줌
		// 람다식으로 이 인터페이스를 사용할 때 개발자가 모르고 2개를 정의했을 때 오류를 알려줌
		MyNumber max = (x, y)->(x>= y)? x:y; // 람다식을 인터페이스 자료형 max 변수에 대입

		System.out.println(max.getMax(10, 20));// 인터페이스 자료형 변수로 함수 호출
		
	//	MyNumber max2 = (x, y)-> x>=y ?x:y;
	//	System.out.println(max2.getMax(10, 20));
	}
}
