package ch12_map.hashmap_1024;

import java.util.HashMap;
import java.util.Iterator;

import ch12_collection_1024.Animal;

public class AnimalHashMap {
	// Animal
		// 포함 관계로 선언 , 다른 클래스 형을 첨부 하는 방법은 매우 많이 사용함.
			private HashMap<Integer, Animal> hashMap2;
			
			// 기본 생성자를 호출 하면서, 다른 클래스형의 컬렉션을 선언한 참조형 변수에 할당하는 작업
			public AnimalHashMap()
			{
				hashMap2 = new HashMap<Integer, Animal>();
			}
			
			// 해당 맵이라는 컬렉션에 추가하고
			public void addAnimal(Animal animal){
				
				hashMap2.put(animal.getAnimalId(), animal);
				
			}
			
			// 해당 맵에서 원소를 제거하고
			public boolean removeAnimal(int animalId){
				
				if(hashMap2.containsKey(animalId)){
					hashMap2.remove(animalId);
					return true;
				}
				
				System.out.println(animalId + "가 존재하지 않습니다");
				return false;
			}
			
			// 해당 컬렉션을 반복자를 통해 보여줌
			public void showAllAnimal(){
				Iterator<Integer> ir = hashMap2.keySet().iterator();
				while (ir.hasNext()){
					int key = ir.next();
					Animal animal = hashMap2.get(key);
					System.out.println(animal);
				}	
				System.out.println();
			}
			public void showAllAnimalDESC(){
				Iterator<Integer> ir = hashMap2.keySet().iterator();
				while (ir.hasNext()){
					int key = ir.next();
					Animal animal = hashMap2.get(key);
					System.out.println(animal);
				}	
				System.out.println();
			}	
}
