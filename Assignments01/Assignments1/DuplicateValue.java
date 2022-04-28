package Assignments1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateValue {

	public static void main(String[] args) {

		
		int[] arr = new int[] {10,20,10,10,20,34,};
		
		int[] dup = new int[arr.length];
		int vcc = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					
					dup[j] = vcc;
				}
			}
			if (dup[i] != vcc)
				dup[i] = count;
		}

		for (int i = 0; i < dup.length; i++) {
			if (dup[i] != vcc)
				System.out.println("Element " + arr[i] + " Occurs : " + dup[i] + " times");
		}
		
	}
}


































//	public static void main(String[] args) {
//
//		int i = 0, j, dup = 0;
//		int[] arr = { 77, 90, 87, 77, 88, 54, 8 };
//		{
//
//			while (i < arr.length) {
//				j = i + 1;
//				int count = 0;
//
//				while (j < arr.length) {
//					if (arr[i] == arr[j]) {
//						System.out.println("Duplicate number is " + arr[i]);
//						dup++;
//						break;
//					}
//					j++;
//				}
//				count++;
//				i++;
//			}
//
//			System.out.println("The Total Number of Duplicates are " + dup);
//		}
//	}
//}
