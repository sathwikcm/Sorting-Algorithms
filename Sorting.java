/**
 * Sathwik Chenna
 * May 21, 2018
 * 1:55:56 AM
 */

/**
 * @author Sathwik Chenna May 21, 2018 1:55:56 AM
 */
public class Sorting {

	/**
	 * 
	 */
	public Sorting() {
		// TODO Auto-generated constructor stub
	}

	public static int[] swap(int[] input, int a, int b) {
		input[a] = input[b] + input[a];
		input[b] = input[a] - input[b];
		input[a] = input[a] - input[b];
		return input;

	}

	public static int[] bubbleSort(int[] input) {

		for (int i = input.length - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (input[j - 1] > input[j]) {
					input = swap(input, j, j - 1);
				}
			}
		}
		return input;
	}

	public static int[] selectionSort(int[] input) {
		int minIndex;
		for (int i = 0; i < input.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < input.length; j++)
				if (input[j] < input[minIndex])
					minIndex = j;
			if (minIndex != i) {
				input = swap(input, i, minIndex);
			}
		}
		return input;
	}

	public static int[] insertionSort(int[] input) {
		int j;
		for (int i = 1; i < input.length; i++) {

			j = i;
			while (j > 0 && input[j - 1] > input[i]) {
				input[j] = input[j - 1];
				j--;
			}
			input[j] = input[i];
		}
		return input;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = { 5, 1, 4, 15, 7, 22, 0 };

		System.out.println("Input Data: ");
		for (int i = 0; i < data.length; i++)
			System.out.print(data[i] + " ");

		System.out.println("\nBubble sort:");
		int[] output = bubbleSort(data);
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");

		System.out.println("\nSelection sort:");
		output = selectionSort(data);
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");

		System.out.println("\nInsertion sort:");
		output = insertionSort(data);
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");

		int[] data1 = { 55, 2, 66, 45, 333, -5, 0, 7, 8, 12, -11, 5 };
		System.out.println("\n\nInput Data: ");
		for (int i = 0; i < data1.length; i++)
			System.out.print(data1[i] + " ");

		System.out.println("\nBubble sort:");
		output = bubbleSort(data1);
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");

		System.out.println("\nSelection sort:");
		output = selectionSort(data1);
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");

		System.out.println("\nInsertion sort:");
		output = insertionSort(data1);
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");

	}

}
