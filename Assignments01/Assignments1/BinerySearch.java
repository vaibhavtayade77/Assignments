package Assignments1;

interface Binery {

	void BinSearch();
}

public class BinerySearch {

	public static void main(String[] args) {

		Binery b = () -> {
			int arr[] = { 10, 20, 30, 40, 50 };
			int key = 30, first = 0, found = 0;

			int last = arr.length - 1;
			int mid = (first + last) / 2;

			while (first <= last) {

				if (arr[mid] < key) {
					first = mid + 1;
				} else if (arr[mid] == key) {

					System.out.println("Element is found at index " + mid);
					found = 1;
					break;

				} else {

					System.out.println("no present");
				}
			}
		};
		b.BinSearch();
	}
}
