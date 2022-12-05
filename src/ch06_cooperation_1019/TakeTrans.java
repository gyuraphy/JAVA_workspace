package ch06_cooperation_1019;

public class TakeTrans {

	public static void main(String[] args) {
		
		// 객체 생성하기. 생성자는 매개변수가 2개인 생성자 호출해서 객체 만들김.
		Student lsyStudent = new Student("이상용", 20000);
		// null : 주소값이 아직 할당 되지 않은 상태
		Bus bus2 = new Bus(2);
		lsyStudent.takeBus(bus2);
		System.out.println("2번 버스를 타고 남은 잔액");
		lsyStudent.showInfo();
		
		Subway subway1 = new Subway("1");
		lsyStudent.takeSubway(subway1);
		System.out.println("지하철 1호선을 타고 남은 잔액");
		lsyStudent.showInfo();
		
		bus2.showInfo();
		subway1.showInfo();
		
		Student lsyStudent2 = new Student("이상용2", 20000);
		lsyStudent2.takeSubway(subway1);
		lsyStudent2.takeBus(bus2);
		
		// 추가 주문
		// 카카오택시 만들기. --> 클래스를 추가만들기
		// 기존 버스의 멤버 및 메서드를 최대한 활용하기.
		// 본인 이름으로 Student 객체를 생성해서
		// 카카오 택시 타고,
		// 조건이 없어서 추가
		// 해당 학생 클래스에 카카오 택시 타는 것을 추가
		// 해당 학생의 정보와 카카오 택시 정보를 출력 해보세요.
		
		Student cdgStudent = new Student("최동규", 50000);
		KakaoTaxi KakaoTaxi3 = new KakaoTaxi(3);
		cdgStudent.takeTaxi(KakaoTaxi3);
		System.out.println("=====================");
		System.out.println("최동규 학생의 택시 탑승 후 정보");
		cdgStudent.showInfo();
		System.out.println("3번 택시의 정보");
		KakaoTaxi3.showInfo();
		System.out.println("=====================");
		
//		// 두 명의 학생을 생성
//		  Student studentJames = new Student("James", 5000);   
//		  Student studentTomas = new Student("Tomas", 10000);
//		  // 디버깅 한번 수행하고 ㅇ
//		  //본인 이름으로 생성하기. ㅇ
//		  // 버스, 지하철 타보기.
//		  // 택시 만들어서 타보세요.
//		  Student lsy = new Student("이상용씨", 20000);
//		  Bus bus103 = new Bus(103);
//		  lsy.takeBus(bus103);     // james가 100번 버스를 탐
//		  lsy.showInfo();           // james 정보 출력
//		  bus103.showInfo();                // 버스 정보 출력
//		  
//		  Subway subwayOrange = new Subway("1호선");  
//		  lsy.takeSubway(subwayOrange);  // Tomas가 2호선을 탐
//		  lsy.showInfo();                 // Tomas 정보 출력
//		  subwayOrange.showInfo(); 
//		   
////		  Bus bus100 = new Bus(100);
////		  studentJames.takeBus(bus100);     // james가 100번 버스를 탐
////		  studentJames.showInfo();           // james 정보 출력
////		  bus100.showInfo();                // 버스 정보 출력
////		  
////		  Subway subwayGreen = new Subway("2호선");  
////		  studentTomas.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
////		  studentTomas.showInfo();                 // Tomas 정보 출력
////		  subwayGreen.showInfo();   
	}
}
