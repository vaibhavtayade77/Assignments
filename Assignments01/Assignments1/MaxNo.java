package Assignments1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Maximum {

	void findmax();
}

public class MaxNo {

	public static void main(String[] args) {

		Maximum obj = () -> {
			int a[] = { 6, 9, 87, 90, 65 };
			int max = a[0];

			for (int i = 1; i < a.length; i++) {

				if (a[i] > max) {

					max = a[i];

				}

			}
			System.out.println("Maximum number is " + max);

		};
		obj.findmax();
	}
}

//List<Integer> ints = Stream.of(77, 12, 45, 65, 34).collect(Collectors.toList());
//
//Integer maxInt = ints.stream().max(Comparator.comparing(i -> i)).get();
//
//System.out.println("Maximum number in the set is " + maxInt);
