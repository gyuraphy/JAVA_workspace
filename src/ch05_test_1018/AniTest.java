package ch05_test_1018;

public class AniTest {

	public static void main(String[] args) {
		//객체를 생성
		//클래스명 참조형변수 = new 클래스의기본생성자();
		//dog 라는 이름의(참조형) 변수를 선언
		//객체를 생성했음
		Animal dog = new Animal();
		// dog 이름, 나이 설정
		dog.name="힝거";
		dog.age=1;
		dog.showInfo();
		
		//고양이 객체 생성, 이름, 나이 ㅣㅈ정
		//출력까지
		
		Animal cat = new Animal();
		cat.name="솜이";
		cat.age=1;
		cat.showInfo();
		System.out.println("dog의 주소 값");
		System.out.println(dog);
		System.out.println("cat의 주소 값");
		System.out.println(cat);
	}

}
