import java.util.Scanner;
public class MinimumValue {
public static void main(String[] args){

	int[] arr = new int[10];
	int count =0 ;

	System.out.println("Enter " +  arr.length + " numbers: ");
	for (int i = 0; i < arr.length; i++) {
		arr[i] = getInput();
	}
	int min = arr [0];
	for (int i = 1; i < arr.length; i++) {
		if (arr[i] < arr[min]){
			min =arr[i];
		}
	}
	System.out.println("Min exists in indexes: ");
	for (int i = 0; i < arr.length ; i++) {
		if (arr[i] == min){
			System.out.println( i+ " ");
			count++;
		}
	}
	System.out.println("The min appeared: " + count + " times");

}

	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}
