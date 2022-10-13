public class H013 {
	// In this Task we use call Function Recursively...
	// Not use any Loops and global variable
	public static void main(String[] args) {
		int arr[] = { 1, 4, 7, 10 };
		int arr1[] = { 2, 6, 3, 8 };
		int index = helper();
		// Passes the First TestCase:
		addOneToEverything(arr, index);
		System.out.println();
		// Passes the Second Testcase:
		addOneToEverything(arr1, index);

	}

	// To track the array of the element position
	// And use the base condition of the recursive funciton(addOneEveryThing)
	public static int helper() {
		int i = 0;
		return i;
	}

	public static int[] addOneToEverything(int[] arr, int index) {
		int result[] = new int[arr.length];
		// Base condition
		if (index > arr.length - 1) {
			return result;
		}
		// Recursive call
		result[index] = arr[index] + 1;

		System.out.print(result[index] + " ");

		return addOneToEverything(arr, index + 1);
	}

}