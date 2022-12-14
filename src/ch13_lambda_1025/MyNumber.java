package ch13_lambda_1025;


// 컴파일러 할 때 알려줌. 이 인터페이스 함수형 인터페이스라서.
// 메서드는 하나! annotation 함수형 인터페이스 즉 메서드는 하나!

// annotation을 사용 하게 되면, 마치 유효성 체크를 하는 것처럼
// 미리 1차 검사.
// 메서드를 만약 모르고 2개를 만들 경우, 문법 체크에서 오류 발생!
@FunctionalInterface
public interface MyNumber {
	
	int getMax(int num1, int num2);
}
