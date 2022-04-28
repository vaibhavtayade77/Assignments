package Assignments1;

public class Duplicateinarray {

	public static void main(String[] args) {
		int arr[] = { 12, 23, 23, 54, 65, 86, 23, 67 };
		int count = 0;
		int ele = 0;
		int n = 23;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == n) {
				count++;

			}
			ele = count;

		}
		System.out.println(n + " " + "count  " + ele + " times");

	}

}
