package sba4;

// Write a program to implement Hashtable and add atleast 4 values into it, implement the putIfAbsent() method.


import java.util.Hashtable;

public class Sba4_03 {
	public static void main(String args[]) {
		Hashtable<Integer, String> m = new Hashtable<Integer, String>();
		m.put(100, "Tom");
		m.put(102, "Tim");
		m.put(101, "Ron");
		m.put(103, "Jim");
		System.out.println("Initial Map: " + m);
		// Inserts, as the specified pair is unique
		m.putIfAbsent(104, "Jhon");
		System.out.println("Updated Map: " + m);
		// Returns the current value, as the specified pair already exist
		m.putIfAbsent(101, "Ron");
		System.out.println("Updated Map: " + m);
	}
}
