import java.util.Random;
import java.util.Scanner;

public class ExFunctionsArrayGool {
	public static void main(String[]args){
	Ex3();
	}
	public static void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static int[] creatRandomArray(int[] arr){
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(20);
		}
		return arr;
	}

	public static void Ex1(){
		System.out.println("Enter number:");
		int number = getInput();
		System.out.println("Enter digit: ");
		int digit = getInput();
		System.out.println(digitAppearInNumber(number, digit));
	}
	public static void Ex2(){
		int[] arr = {324, 23, 34, 54};
		int digit = 2;
		System.out.println(digitAppearInNumberArray(arr, digit));

	}
	public static void Ex3(){
		System.out.println("Enter a size for array one: ");
		int size1=getInput();
		System.out.println("Enter a size for array two: ");
		int size2=getInput();
		int []parameterA = new int[size1];
		int []parameterB = new int[size2];
		creatRandomArray(parameterA);
		System.out.print("The Random Array one is: ");
		printArray(parameterA);
		creatRandomArray(parameterB);
		System.out.print("The Random Array two is: ");
		printArray(parameterB);
		int[] newArr = aUnionB(parameterA, parameterB);
		System.out.print("A UNION B is: ");
		printArray(newArr);

	}
	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	public static int digitAppearInNumber(int number, int digit){
		int counter = 0;

		while (number > 0){
			if (number % 10 == digit){
				counter++;
			}
			number /= 10;
		}
		return counter;
	}
	public static int digitAppearInNumberArray(int[] arr, int digit){
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			counter += digitAppearInNumber(arr[i], digit);
			}
		return counter;
	}
	public static int countValuesExistingInBothArrays(int[] arr1, int[] arr2){
		int lengthForArray = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					lengthForArray++;
					break;
				}
			}
		}return lengthForArray;
	}
	public static int[] aUnionB(int[] parameterA, int[] parameterB){

		int[] newArr = new int[countValuesExistingInBothArrays(parameterA, parameterB)];
		int indexForEqualsArray=0;
		for (int i = 0; i < parameterA.length; i++) {
			for (int j = 0; j < parameterB.length; j++) {
				if (parameterA[i] == parameterB[j]) {
					newArr[indexForEqualsArray++] = parameterA[i];
					break;
				}
			}
		}
		return newArr;
	}

}
