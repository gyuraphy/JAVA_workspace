package ch12_generics_1024;

import ch05_test_1018.Animal;
import ch05_test_1205.Person;

public class GenericMethod {
	
	// <T, V> : 매개변수으 ㅣ자료형
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number)p1.getX()).doubleValue();
		double left2 = ((Integer)p1.getX()).doubleValue();
		double right =((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left2;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		
		// Integer Wrapper 클래스 형, 생성자 호출 없이 기본형 데이터 타입이 바로 들어간 것
		// 이 Wrapper 클래스의 특징임 자동 형번환, auto boxing, unboxing
		// Double Wrapper 클래스 형 
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		// 다음 예제로 객체 생성시, 원하는 형으로 선언 가능
		Point<Person, Animal> p3 = new Point<>(new Person(), new Animal());
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
		System.out.println("두 점으로 만들어진 사각형의 넓이는 " + rect + "입니다.");
	}
}
