package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListClass {
	
	public static void main(String[] args) {
		
		List<Object> lc = new ArrayList<Object>();
		System.out.println("------- Add ---------");
		
		lc.add(15);
		lc.add("final");
		lc.add(25);
		lc.add(78);
		lc.add("Mango");
		lc.add("elements");
		lc.add(25);
		lc.add('f');
		System.out.println(lc);
		
		System.out.println("------- Add all ---------");
		
		List<Object> lc1 = new ArrayList<Object>();
		
//		lc1.add(15);
//		lc1.add("final");
//		lc1.add(25);
//		lc1.add(78);
//		lc1.add("Mango");
//		lc1.add("elements");
//		lc1.add(25);
//		lc1.add('f');
//		System.out.println(lc1);
		
		Collections.addAll(lc1, 15, "final", 25, 15, 78, "mango", "elements", 16, 'f');
		System.out.println(lc1);
//		
		System.out.println("------- Get ---------");
		
		Object get = lc.get(5);
		System.out.println(get);
		
		System.out.println("------- size ---------");
		int size = lc.size();
		System.out.println(size);
		
		System.out.println("------- Index of ---------");
		int indexOf = lc.indexOf(25);
		System.out.println(indexOf);
		
		System.out.println("------- Last Index of ---------");
		int lastIndexOf = lc.lastIndexOf(25);
		System.out.println(lastIndexOf);
		
		System.out.println("------- Index based add ---------");
		lc.add(3, 15);
		System.out.println(lc);
		
		System.out.println("------- Index based set ---------");
		lc.set(7, 16);
		System.out.println(lc);
		
		System.out.println("------- contains ---------");
		boolean contains = lc.contains(15);
		System.out.println(contains);
		
		System.out.println("------- remove ---------");
		Object remove = lc.remove(5);
		System.out.println(remove);
		System.out.println(lc);
		
		System.out.println("------- Index based addAll ---------");
		lc.add(5, "mango");
		System.out.println(lc);
		
		System.out.println("------- add All ---------");
		lc.addAll(lc1);
		System.out.println(lc);
		
		System.out.println("------- contains all ---------");
		boolean contains2 = lc.contains(lc1);
		System.out.println(contains2);
		
		System.out.println("------- retainAll ---------");
		lc.retainAll(lc1);
		System.out.println(lc1);
		
//		System.out.println("------- Sublist ---------");
//		List<Object> subList = lc.subList(2, 6);
//		System.out.println(subList);

		System.out.println("------- IsEmpty ---------");
		boolean empty = lc.isEmpty();
		System.out.println(empty);
		
		System.out.println("------- Clear ---------");
		lc.clear();
		System.out.println(lc);
		
		System.out.println("------- IsEmpty ---------");
		boolean empty1 = lc.isEmpty();
		System.out.println(empty1);
		
	}

}
