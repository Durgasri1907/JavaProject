package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> ll = new LinkedList<Object>();
		
		ll.add(15);
		ll.add("final");
		ll.add(25);
		ll.add(78);
		ll.add("Mango");
		ll.add("elements");
		ll.add(25);
		ll.add('f');
		System.out.println(ll);
		
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
		
		Object get = ll.get(5);
		System.out.println(get);
		
		System.out.println("------- size ---------");
		int size = ll.size();
		System.out.println(size);
		
		System.out.println("------- Index of ---------");
		int indexOf = ll.indexOf(25);
		System.out.println(indexOf);
		
		System.out.println("------- Last Index of ---------");
		int lastIndexOf = ll.lastIndexOf(25);
		System.out.println(lastIndexOf);
		
		System.out.println("------- Index based add ---------");
		ll.add(3, 15);
		System.out.println(ll);
		
		System.out.println("------- Index based set ---------");
		ll.set(7, 16);
		System.out.println(ll);
		
		System.out.println("------- contains ---------");
		boolean contains = ll.contains(15);
		System.out.println(contains);
		
		System.out.println("------- remove ---------");
		Object remove = ll.remove(5);
		System.out.println(remove);
		System.out.println(ll);
		
		System.out.println("------- Index based addAll ---------");
		ll.add(5, "mango");
		System.out.println(ll);
		
		System.out.println("------- add All ---------");
		ll.addAll(lc1);
		System.out.println(ll);
		
		System.out.println("------- contains all ---------");
		boolean contains2 = ll.contains(lc1);
		System.out.println(contains2);
		
		System.out.println("------- retainAll ---------");
		ll.retainAll(lc1);
		System.out.println(lc1);
		
		System.out.println("------- Sublist ---------");
		List<Object> subList = ll.subList(2, 6);
		System.out.println(subList);

		System.out.println("------- IsEmpty ---------");
		boolean empty = ll.isEmpty();
		System.out.println(empty);
		
		System.out.println("------- Clear ---------");
		ll.clear();
		System.out.println(ll);
		
		System.out.println("------- IsEmpty ---------");
		boolean empty1 = ll.isEmpty();
		System.out.println(empty1);
		

	}

}
