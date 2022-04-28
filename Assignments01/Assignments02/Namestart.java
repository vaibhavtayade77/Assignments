package Assignments02;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Namestart {

	String name;

	public Namestart(String name) {
		this.name = name;

	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Ajay");
		al.add("Akshay");
		al.add("Sujit");
		al.add("Vaibhav");
		al.add("arjun");

		List<String> a = al.stream().filter(n -> (n.startsWith("A")||n.startsWith("a"))).collect(Collectors.toList());
		System.out.println(a);

	}

}
