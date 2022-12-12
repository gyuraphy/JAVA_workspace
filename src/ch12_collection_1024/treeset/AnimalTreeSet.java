package ch12_collection_1024.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import ch12_collection_1024.Animal;

public class AnimalTreeSet {

	private TreeSet<Animal> treeSet;

	public AnimalTreeSet(){
		treeSet = new TreeSet<Animal>();
	}
	
	public void addAnimal(Animal animal){
		treeSet.add(animal);
	}
	
	public boolean removeAnimal(int animalId){
		
		Iterator<Animal> ir = treeSet.iterator();
		
		while( ir.hasNext()){
			Animal animal = ir.next();
			int tempId = animal.getAnimalId();
			if( tempId == animalId){
				treeSet.remove(animal);
				return true;
			}
		}
		
		System.out.println(animalId + "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllAnimal(){
		for(Animal animal : treeSet){
			System.out.println(animal);
		}
		System.out.println();
	}
}
