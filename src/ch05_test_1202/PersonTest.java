package ch05_test_1202;

public class PersonTest {
   
	 public static void main(String[] args) {
		 //기본생성자 호출
		  Person cdg = new Person();
//		  cdg.name="최동규";
		  cdg.height=180F;
		  cdg.weight=89F;
		  cdg.setName("최동규세터로추가했음");
		  cdg.showInfo();
		  System.out.println("get 메서드로 이름호출 : " + cdg.getName());
		  //set (메서드)을 이용해서 name 값 설정하기
		  
		  
		  //매개변수가 1개인 생성자 호출
		  Person cdg2 = new Person("최동규");
		  cdg2.height=171F;
		  cdg2.weight=75F;
		  cdg2.showInfo();
		  
		  //매게변수가 3개인 생성자 호출
		  Person cdg3 = new Person("최동규",171F,75F);
		  cdg3.showInfo();		  
		  
//		  personKim.name = "김유신";
//		  personKim.weight = 85.5F;
//		  personKim.height = 180.0F;
		
		  Person personLee = new Person("이순신", 175, 75);
	 }
}
