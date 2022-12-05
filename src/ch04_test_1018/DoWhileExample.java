package ch04_test_1018;

import java.io.IOException;

public class DoWhileExample {

	public static void main(String[] args)  {

		int num = 1; 
		int sum = 0;
		
		do{	
			System.out.println("do 실행문이 " + num +"번째" + " 반복 실행중입니다.");
			sum += num;
			num++;	
			
		}while( num <= 10  );
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
	}
}