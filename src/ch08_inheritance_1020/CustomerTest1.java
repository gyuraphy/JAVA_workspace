package ch08_inheritance_1020;

public class CustomerTest1 {

	public static void main(String[] args) {
		// 모든 클래스는 부모 클래스가 : Object 최고 상위 클래스가 암묵적으로 생성자 호출하는 부분 생략
		
		// 상속을 배워서, 자식 클래스라고 말하는 것은, 여기에 부모 클래스가 있다는 이야기
		
		// VIPCustomer extends Customer
		// 자식클래스가 자기 멤버를 초기화 하기전에, 먼저 부모클래스를 생성자 호출하여 초기화
				
		Customer customerLee = new Customer(10010, "이순신");
//		Customer customerLee = new Customer();
//		customerLee.setCustomerID(10010);
//		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("===============================");
		
		//VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// 다형성에서 부모 클래스 형으로 받으면
		// 바라 보는 관점은 부모 클래스 형으로 보임
		// 확인 lsy. 찍어보면 부모 클래스만 보임
		// 원래의 자식 클래스 형으로 변환 다운 캐스팅
		// 명시적 형변환을 했을 때, 이것을 받을 형은 원래 자식 클래스 형
		// 확인 lsy7. 찍어보면 자식 클래스와 부모 클래스 전부 보임
		// 반드시 상속은 자식보다 부모가 먼저 초기화 되고 1타 2피 사용 가능
		
		Customer lsy = new VIPCustomer();
		VIPCustomer lsy7 = (VIPCustomer)lsy;
		
//		부모(큰집)     = 자식(작은집)
		VIPCustomer lsy2 = new VIPCustomer();
		Object lsy3 = new VIPCustomer();
		
		
	}
}
