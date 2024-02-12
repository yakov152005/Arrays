import java.util.Random;
import java.util.Scanner;

public class ExArrays {
	public static void main(String[] args) {
		
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
	public static double[] createDoubleArray(int size, double value) {
		double[] arr = new double[size];
		for (int i = 0; i < size; i++) {
			arr[i] = value;
		}
		return arr;
	}
	public static void printDoubleArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void createRandomArray(int[] arr, int number) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(number + 1);
		}
	}
	public static int[] consecutiveNumbers(int a, int b) {
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] =b + i;
		}
		return arr;
	}
	public static int sumArray (int[] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}return sum;
	}
	public static void printHighestNumberInArray(int[] arr){
		int highNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > highNum) {
				highNum = arr[i];
			}
		}
		System.out.println("\nThe Highest number in the array is: " + highNum);
	}
	public static int ReturnHighestNumberInArray(int[] arr){
		int maxNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >maxNum){
				maxNum = arr[i];
			}
		}return maxNum;
	}
	public static int numberAppear (int[] arr, int num){
		int maxIndex=0;
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == num) {
				maxIndex++;
			}
		}return maxIndex;
	}
	public static void removeDigitInArray(int[] arr, int num){
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] !=num){
				System.out.print(arr[i] + " ");
			}
		}
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
	public static void Ex5(){
		int a = 6;
		int b = 4;
		int[] arr = consecutiveNumbers(a,b);
		printArray(arr);
	}
	public static void Ex6(){
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = createArray(size);
		int result = sumArray(arr);
		System.out.println(result);
	}
	public static void Ex7(){
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int[] arr = createArray(size);
		printHighestNumberInArray(arr);
	}
	public static void Ex8(){
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int [] arr = createArray(size);
		int highNumber = ReturnHighestNumberInArray(arr);
		System.out.println(highNumber);
	}
	public static void Ex9(){
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int [] arr = new int[size];
		createRandomArray(arr, 100+1);
		printArray(arr);
		printHighestNumberInArray(arr);
	}
	public static void Ex10(){
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int [] arr = createArray(size);
		System.out.print("Enter a addition number: ");
		int number =getInput();
		int result = numberAppear(arr, number);
		System.out.println("The number " + number + " appears " + result + " in the array.");
	}
	public static void Ex11(){
		int size;
		System.out.print("Enter a size  for arr: ");
		size = getInput();
		int [] arr = createArray(size);
		System.out.print("Enter a addition number: ");
		int number =getInput();
		removeDigitInArray(arr, number);


	}

}
