import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = new int [10];

        System.out.printf("Please enter %d numbers: " , arr.length); //%d ואז פסיק עם שם האינט זה במקום הכמות של האינט
        for (int i = 0; i<arr.length; i++)
            arr[i] = s.nextInt();

        System.out.print("All even values: ");
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
