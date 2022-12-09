package ch11_object_1021;

class Book{ // 암묵적으로 Object 상속을 받고 있다
	// Object 에는 toSting 메서드가 존재
	// 이 메서드는 의미가 없는 해당 메모리 주소값을 출력함
	// 실제 작업은 메모리 주소가 아닌 데이터를 다룸, 그렇기에 재정의해서 사용함
	
	int bookNumber;
	String bookTitle;

	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		
		return bookTitle + "," + bookNumber;
	}
	
}

public class ToStringEx {

	public static void main(String[] args) {

	Book book1 = new Book(200, "개미");
	
	System.out.println(book1);
	System.out.println(book1.toString());
	}
}

