package ch07_array_1019;

import ch11_classex_1024.Person;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] data = new double[5];
		String[] data2 = new String[5];
		Person[] data3 = new Person[5];
		// 배열에 값을 3개만 할당, 나머지 2개는 하지 않음
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		data2[0] = "lsy";
		data3[0] = new Person();
		
		// 반복문으로 하나씩 값을 사용한다.(값을 불러온다.)		
		for(int i=0; i<data2.length; i++){
			System.out.println(data2[i]);
			
		}
	}
}
