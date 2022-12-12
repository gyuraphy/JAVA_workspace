package ch12_collection_1024.treeset;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("이상용1");
		treeSet.add("이상용4");
		treeSet.add("이상용3");
		treeSet.add("이상용2");
		treeSet.add("이상용3");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("이상용1"));
		hashSet.add(new String("이상용4"));
		hashSet.add(new String("이상용3"));
		hashSet.add(new String("이상용2"));
		hashSet.add(new String("이상용3"));
		
		System.out.println(hashSet);
	}
}
