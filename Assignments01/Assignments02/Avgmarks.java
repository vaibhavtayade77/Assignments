package Assignments02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.BaseStream;
import java.util.stream.Stream;

public class Avgmarks {

	int marks;

	public Avgmarks(String string, int i) {

		this.marks = marks;
	}

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(75);
		al.add(45);
		al.add(56);
		al.add(78);

		Double avgmark = al.stream().mapToDouble(s -> s.intValue()).average().getAsDouble();
		System.out.println("Average of marks : " +avgmark);

	}

}
