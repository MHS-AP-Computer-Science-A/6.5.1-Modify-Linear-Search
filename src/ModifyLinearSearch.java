
public class ModifyLinearSearch {
	public static void main(String[] args) {
		String[] words = { "Lions", "Wolverines", "Tigers", "Loons", "Spartans", "Cardinals", "Chips" };

		System.out.println("Testing linearSearch1:");
		linearSearch1(words, "Loons");

		System.out.println("\nTesting linearSearch1 not found:");
		linearSearch1(words, "Bears");

		System.out.println("\nTesting linearSearch2:");
		linearSearch2(words, "Chips");

		System.out.println("\nTesting linearSearch2 not found:");
		linearSearch2(words, "Hoosiers");
	}

	// Modify this to search for a String in a String array
	static void linearSearch1(int[] arr, int toFind) {
		boolean isFound = false;

		for (int i = 0; i < arr.length; i++) {
			if (toFind == arr[i]) {
				isFound = true;
				System.out.println(toFind + " found at position " + i);
			}
		}

		if (!isFound) {
			System.out.println(toFind + " was not found.");
		}
	}

	// Modify this to search for a String in a String array
	static void linearSearch2(int[] arr, int toFind) {
		boolean isFound = false;

		for (int item : arr) {
			if (toFind == item) {
				isFound = true;
				System.out.println(toFind + " found!");
			}
		}

		if (!isFound) {
			System.out.println(toFind + " was not found.");
		}
	}
}

