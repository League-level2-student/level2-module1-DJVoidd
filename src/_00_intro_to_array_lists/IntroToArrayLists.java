package _00_intro_to_array_lists;

import java.util.ArrayList;
import java.util.Collections;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("Dean");
		list.add("Daen");
		list.add("Deab");
		list.add("Daeb");
		list.add("Naed");
		list.add("Dan");
		//3. Print all the Strings using a standard for-loop
		System.out.println("List of names I've been called:\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 1; i < list.size(); i+=2) {
			System.out.println(list.get(i));
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		Collections.reverse(list);
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for (String string : list) {
			if(string.contains("e")) {
				System.out.println(string);
			}
		}
	}
}
