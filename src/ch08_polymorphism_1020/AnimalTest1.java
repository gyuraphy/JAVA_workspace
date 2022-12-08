package ch08_polymorphism_1020;

import java.util.ArrayList;

class Animal{
	// 각자 좋아하는 동물 클래스를 만듬 예: Dog
	// 각 동물들의 공통 기능, move, eat,
	// 공통 기능 추가 소리나는 기능 추가. sound
	// Animal 에도 있고, 각 하위 클래서에서 재정의해서 사용
	// 좋아하는 동물 클래스를, move, eat, sound
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}
	public void eat()
	{
		System.out.println("동물이 먹는다.");
	}
	public void sound()
	{
		System.out.println("동물이 소리낸다.");
	}
}

class Human extends Animal{
	public void move()
	{
		System.out.println("사람이 두 발로 걷습니다. ");
	}	
	public void readBook()
	{
		System.out.println("사람이 책을 읽습니다. ");
	}
	public void eat()
	{
		System.out.println("사람이 밥을 먹는다.");
	}	
	public void sound()
	{
		System.out.println("사람이 말한다.");
	}
}

class Tiger extends Animal{
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
	public void hunting() 
	{
		System.out.println("호랑이가 사냥을 합니다. ");
	}
	public void eat()
	{
		System.out.println("호랑이는 고기를 먹는다.");
	}	
	public void sound()
	{
		System.out.println("어흥");
	}
}

class Eagle extends Animal{
	public void move()
	{
		System.out.println("독수리가 하늘을 납니다 ");
	}	
	public void flying() 
	{
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
	public void eat()
	{
		System.out.println("독수리가 고기를 먹는다.");
	}
	public void sound()
	{
		System.out.println("끼룩");
	}
}

class Lsy extends Animal{
	public void move()
	{
		System.out.println("이상용 걸어감.");
	}	
	public void read() 
	{
		System.out.println("이상용 책 봄.");
	}
	public void eat()
	{
		System.out.println("이상용 식사함.");
	}
	public void sound()
	{
		System.out.println("이상용!");
	}
}

class cat extends Animal{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("냥이 걸어옴");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("냥이 츄르 먹는중");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("냥이 야옹!");
	}
	
//	public void move()
//	{
//		System.out.println("냥이 걸어옴");
//	}		
//	public void eat()
//	{
//		System.out.println("냥이 츄르 먹는중");
//	}
//	public void sound()
//	{
//		System.out.println("냥이 야옹!");
//	}
}
public class AnimalTest1 {
	// 상속이라는 개념이 
	// 재사용성, 중복제거. 
	// 다형성 -> 재할당을 할 때 , 받을 수 있는 매개변수의 범위를 넓히자. 
	// 한계 , 상속이 한번만, 그러면, 기능을 다르게 매번 구현을 할려면, 
	// 자식 클래스에서 구현 하고 싶은 기능이 다양함, 하지만, 반드시 이기능은 꼭 써주세요 라는 부분이 있더라. 
	// 강제성이 필요할 때가 있음. 
	// 해당 기능을 각 자식 클래스에서 다르게 구현을 유연하게 하기 위해서 -> 인터페이스, 추상클래스. 
	
	 public static void main(String[] args) {
		  AnimalTest1 aTest = new AnimalTest1();
		  aTest.moveAnimal(new Human());
		  aTest.moveAnimal(new Tiger());
		  aTest.moveAnimal(new Eagle());
		  Lsy lsy = new Lsy();
		  aTest.moveAnimal(lsy);
		  aTest.moveAnimal(new Lsy());
		  aTest.eatFood(lsy);
		  aTest.eatFood(new Human());
		  aTest.eatFood(new Tiger());
		  aTest.eatFood(new Eagle());		  
		  cat somi = new cat();
		  aTest.moveAnimal(somi);
		  aTest.eatFood(somi);
		  aTest.soundTalk(somi);
	 }

	 public void moveAnimal(Animal animal) { //매개 변수의 자료형이 상위 클래스
		  animal.move();                     //재정의 된 메서드 호출
	 }   
	 
	 public void eatFood(Animal animal) {
		animal.eat();
	 }
	 
	 public void soundTalk(Animal animal) {
			animal.sound();
	 }
}



