package com.xworkz.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StudentDTOTester {

	public static void main(String[] args) {
		StudentDTO dto = new StudentDTO("Harsha","ECE","1SJ16EC113","Final-year");
		System.out.println(dto);
		
		StudentDTO dto1 = new StudentDTO("Aravind","ECE","1SJ16EC065","Third-year");
		System.out.println(dto1);
		
		StudentDTO dto2 = new StudentDTO("Pavan","ECE","1SJ16EC113","Final-year");
		System.out.println(dto2);
		
		StudentDTO dto3 = new StudentDTO("Bhanu","ECE","1SJ16EC113","Second-year");
		System.out.println(dto3);
		
		StudentDTO dto4 = new StudentDTO("Abhilash","ECE","1SJ16EC113","Second-year");
		System.out.println(dto4);
		
		Collection<String> details = new ArrayList<>();
		
		List <String> name = new ArrayList<String>();
		name.add("Aravind");
		name.add("Pavan");
		name.add("Bhanu");
		name.add("Abhilash");
		
		System.out.println(name);
		
		List <String> branch = new ArrayList<String>();
		branch.add("CSE");
		branch.add("CV");
		branch.add("ISE");
		branch.add("EEE");
		branch.add("ECE");
		
		System.out.println(branch);
//		System.out.println(branch.size());
//		System.out.println(name.get(3));
//		
//		int indexOfBhanu = name.indexOf("Bhanu");
//		System.out.println("Bhanu Index:"+ indexOfBhanu);
//		
//		ListIterator<String> itr = name.listIterator(2);
//		System.out.println("Itr index :" + itr.nextIndex());
//		while (itr.hasPrevious()) {
//			String e = itr.previous();
//			System.out.println(e);
//		}
//		System.out.println("*********");
//		
//		while (itr.hasNext()) {
//			String string = itr.next();
//			System.out.println(string);
//		}
//		System.out.println("-------------------");
//		
//		ListIterator<String> itr1 = name.listIterator(3);
//		System.out.println("Itr1 index : " + itr1.nextIndex());
//		while (itr1.hasPrevious()) {
//			String s = itr1.previous();
//			System.out.println(s);
//		}
//
//		System.out.println("*********");
//		while (itr1.hasNext()) {
//			String str = itr1.next();
//			System.out.println(str);
//		}
//		
		
		System.out.println("\nAdd All...");
		details.addAll(name);
		details.addAll(branch);
		System.out.println(details.size());
		System.out.println(details);
		
		System.out.println("\nsort");
		Collections.sort(name);
		Collections.sort(branch);
		System.out.println(name);
		System.out.println(branch);
		
//		List<String> check = new ArrayList<>();
		
		System.out.println("\nContainsAll");
//		System.out.println(details.containsAll(check));
		System.out.println(details.containsAll(name));
		System.out.println(details.containsAll(branch));
		
//		System.out.println("\nRemoveAll");
//		details.removeAll(branch);
//		System.out.println(details);
//		System.out.println(branch);
//		System.out.println(name.size());
		
		System.out.println("\nRetainAll");
		System.out.println(details);
		System.out.println(details.retainAll(name));
		System.out.println(details);
	}
}
