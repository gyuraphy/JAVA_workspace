package ch07_arraylist_1020;


public class StudentTest {

	public static void main(String[] args) {
		// 본인 이름의 Student 형으로 객체를 생성
		// 본인이 수강하고 싶은 과목 3개 등록(점수 포함) 예)java, spring, Android		
		// 해당 정보 출력. showStudentInfo 활용 
		
		// LunchMenu : ArrayList 만들고, Student 클래스에 추가해서
		// 점심 메뉴 추가하는 기능, 출력하는 기능등을 만들어서, 출력
		// 참고는 Subject를 참고해서 만들어보기.
		
		Student studentCdg = new Student(1004, "CDG");
		
		studentCdg.addSubject("java", 70);
		studentCdg.addSubject("spring", 85);
		studentCdg.addSubject("Android", 100);
		
		studentCdg.showStudentInfo();
		
		// 응용
		// LunchMenu : ArrayList 만들어서, Student 클래스에 추가해서,
		// 점심 메뉴 추가하는 기능, 출력하는 기능등을 만들어서 , 출력해보기.
		// 참고는 Subject를 참고해서 만들어보기.
		studentCdg.addMenu("스테이크", 8900,"자라 건물에 5층인데 만화카페 옆 로봇이 배달해줌. 먹을만함.");
		studentCdg.showStudentInfo();
		
		// Student 형으로 객체를 생성하면
		// 멤버로, 아이디, 이름, 과목리스트로 구성
		Student studentLee = new Student(1001, "Lee");
		
		// 해당 과목리스트(객체)를 추가
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		//본인 이름으로 과목 추가해서 , 출력해보기. 시간 3분.
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		Student studentLsy = new Student(1003, "이상용");
		
		//본인 이름으로 과목 추가해서 , 출력해보기. 시간 3분.
		studentLsy.addSubject("국어", 70);
		studentLsy.addSubject("수학", 85);
		studentLsy.addSubject("영어", 100);
		
//		studentLee.showStudentInfo();
//		System.out.println("======================================");
//		studentKim.showStudentInfo();
		
		System.out.println("======================================");
		studentLsy.showStudentInfo();
		
		
	}
}
