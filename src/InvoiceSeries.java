import java.util.Scanner;
public class InvoiceSeries {
public static void main(String[] args) {
	boolean isSeries = true;
	int[] arr = new int[5];
	int[] arr2 = new int[5];
	System.out.println("Enter " + arr.length + " numbers:");
	for (int i = 0; i < arr.length; i++) {
		arr[i] = getInput();
	}
	int difference = arr[1] - arr [0];
	for (int i = 2; i < arr.length; i++) {
		if (arr[i] - arr[i-1] != difference){
			isSeries = false;
		}
	}if (isSeries){
		System.out.println("Its invoice series :)");
	}else {
		System.out.println("Its NOT invoice series :(");
	}

}





	public static int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}

