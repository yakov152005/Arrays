import java.util.Random;
import java.util.Scanner;

public class ExArrays {
	public static void main(String[] args) {
Ex16();
	}

	public static int getInput() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];
		System.out.println("Enter " + arr.length + " numbers:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = getInput();
		}
		return arr;
	}

	public static void printArrayForEx1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i % 2 == 1) {
				System.out.print(", ");
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void printReversNumberArray(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void printDoubleArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static double[] createDoubleArray(int size, double value) {
		double[] arr = new double[size];
		for (int i = 0; i < size; i++) {
			arr[i] = value;
		}
		return arr;
	}

	public static void createRandomArray(int[] arr, int number) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(number * 10);
		}
	}

	public static int[] createAndFillRandomArray(int size) {
		Random r = new Random();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = r.nextInt(size * 10);
		}
		return array;
	}

	public static int[] consecutiveNumbers(int a, int b) {
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = b + i;
		}
		return arr;
	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void printHighestNumberInArray(int[] arr) {
		int highNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > highNum) {
				highNum = arr[i];
			}
		}
		System.out.println("\nThe Highest number in the array is: " + highNum);
	}

	public static int ReturnHighestNumberInArray(int[] arr) {
		int maxNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}

	public static int numberAppear(int[] arr, int num) {
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				maxIndex++;
			}
		}
		return maxIndex;
	}

	public static void removeDigitInArray(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	public static int theSumOfLargestArray(int[] arr1, int[] arr2) {
		int sumForFirstArray = 0;
		int sumForSecondArray = 0;
		for (int i = 0; i < arr1.length; i++) {
			sumForFirstArray += arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sumForSecondArray += arr2[i];
		}
		if (sumForFirstArray > sumForSecondArray) {
			return 1;
		} else if (sumForSecondArray > sumForFirstArray) {
			return 2;
		} else
			return 0;
	}

	public static int[] newArrOnNumber(int number) {
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] += number % 10;
			number /= 10;
		}
		return arr;
	}

	public static void Ex1And2() {
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = createArray(size);
		printArrayForEx1(arr);
	}

	public static void Ex3() {
		int size = 5;
		double value = 3.2;
		double[] result = createDoubleArray(size, value);
		printDoubleArray(result);
	}

	public static void Ex4() {
		int[] arr = new int[10];
		int number = 100;
		createRandomArray(arr, number);

		System.out.println("The random numbers : ");
		printArray(arr);
	}

	public static void Ex5() {
		int a = 6;
		int b = 4;
		int[] arr = consecutiveNumbers(a, b);
		printArray(arr);
	}

	public static void Ex6() {
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = createArray(size);
		int result = sumArray(arr);
		System.out.println(result);
	}

	public static void Ex7() {
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = createArray(size);
		printHighestNumberInArray(arr);
	}

	public static void Ex8() {
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = createArray(size);
		int highNumber = ReturnHighestNumberInArray(arr);
		System.out.println(highNumber);
	}

	public static void Ex9() {
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = new int[size];
		createRandomArray(arr, 100 + 1);
		printArray(arr);
		printHighestNumberInArray(arr);
	}

	public static void Ex10() {
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = createArray(size);
		System.out.print("Enter a addition number: ");
		int number = getInput();
		int result = numberAppear(arr, number);
		System.out.println("The number " + number + " appears " + result + " in the array.");
	}

	public static void Ex11() {
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = createArray(size);
		System.out.print("Enter a addition number: ");
		int number = getInput();
		removeDigitInArray(arr, number);


	}

	public static void Ex12() {
		int size;
		System.out.println("Enter size for array: ");
		size = getInput();
		int[] arr = createAndFillRandomArray(size);
		System.out.print("The original array is: ");
		printArray(arr);
		System.out.println();
		System.out.print("The new arr without the most common: ");
//לא סיימתי
	}

	public static void Ex13() {
		System.out.println("Enter size for array One: ");
		int size1 = getInput();
		int[] arr1 = createArray(size1);
		System.out.println("Enter size for array Two: ");
		int size2 = getInput();
		int[] arr2 = createArray(size2);
		System.out.print("The first array is: ");
		printArray(arr1);
		System.out.println();
		System.out.print("The second array is: ");
		printArray(arr2);
		System.out.println();
		int result = theSumOfLargestArray(arr1, arr2);
		System.out.println("1 - The sum of first array greater\n" +
				"2 - The sum of second array greater,\n" +
				"0 - The arrays is equals.  ");
		System.out.println("The result is: " + result);
	}

	public static void Ex14() {
		int number = 244;
		int[] newArr = newArrOnNumber(number);
		printReversNumberArray(newArr);


	}

	public static void Ex16(){
		System.out.println("Enter number for check if a palindrome: ");
		int number =getInput();
		System.out.println(itsPalindromeNumber(number));
	}
	public static boolean itsPalindromeNumber(int number) {
		int originalNum = number;
		int reversNum = 0;
		boolean temp = false;
		if (number > 10000) {
			while (number > 0) {
				int digit = number % 10;
				reversNum = reversNum * 10 + digit;
				number /= 10;
			}
			if (originalNum == reversNum) {
				temp = true;
			}
		} else if (number / 100 == originalNum % 10 ||number / 10 == originalNum % 10) {
			temp = true;
		}
		return temp;
	}
}

