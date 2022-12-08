package ch09_abstractex_1020;

public class ComputerTest {

	public static void main(String[] args) {
		//추상 클래스는 인스턴스화 할수 없다. 
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		// c2 바라보는 관점 Computer
		c2.display();
		c2.typing();
		c2.turnOn();
		c2.turnOff();
		System.out.println("=========================");
//		Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		c4.display();
		c4.typing();
		c4.turnOn();
		c4.turnOff();
	}
}
