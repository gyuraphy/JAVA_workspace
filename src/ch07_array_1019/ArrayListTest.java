package ch07_array_1019;

// ctrl + shift + o : 자동임포트
// ArrayList를 사용하기 위해서는 import가 필요
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// 추가사항
		// Student 타입으로 ArrayList 를 만들기 -> students ㅇ
		// 해당 ArrayList에 각자 알고 있는 이름 3개 등록 ㅇ
		// Student에 생성자를 잘 보고 객체 만들기 ㅇ
		// showInfo()를 이용해 출력
		// 기본 for문 출력
		// 향상된 for문 출력
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add( new Student("진도준") );
		students.add( new Student("진윤기") );
		students.add( new Student("이해인") );
		
		
		for(int i=0; i<students.size(); i++){
			
			Student student = students.get(i);
			student.showInfo();
		}

		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Student student : students){
			student.showInfo();
		}
		
		// 기본 선언하는 부분
		ArrayList<Book> library = new ArrayList<Book>();

		// Book 타입만 넣기 <Book> 제네릭 타입형식으로 지정
		// library.add("lsy"); <- String 타입을 넣어 오류발생
		
		// library , ArrayList 형식은 Book 타입의 객체 5개를 등록 했음
		library.add( new Book("태백산맥", "조정래") );
		library.add( new Book("데미안", "헤르만 헤세") );
		library.add( new Book("어떻게 살 것인가", "유시민") );
		library.add( new Book("토지", "박경리") );
		library.add( new Book("어린왕자", "생텍쥐페리") );
		
		// 기본 반복문 for문을 이용하여, 해당 ArrayList 에 있는 값을 가져오기
		for(int i=0; i<library.size(); i++){
	
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library){
			book.showBookInfo();
		}
	}
}
