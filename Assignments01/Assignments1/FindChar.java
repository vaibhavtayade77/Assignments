package Assignments1;

import java.util.Scanner;

interface CharLambda {

	void show();
}

public class FindChar {
	public static void main(String[] args) {

		CharLambda n = () -> {

			String s1 = "Vaibhav";
			char ch[] = s1.toCharArray();
			int index;
			Scanner sc = new Scanner(System.in);
			System.out.println("Index no. ");
			index = sc.nextInt();
			System.out.println(ch[index]);
		};
		n.show();

	}
}
