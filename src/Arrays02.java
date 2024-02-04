import java.util.Scanner;
public class Arrays02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char [] letters = new char [10];

        System.out.printf("Please enter %d charachters: " , letters .length); //%d ואז פסיק עם שם האינט זה במקום הכמות של האינט
        for (int i = 0; i<letters .length; i++)
            letters [i] = s.next().charAt(0);

        System.out.print("Indexes of capital letters: ");
        for (int i = 0; i<letters .length; i++) {
            if (letters [i] >= 'A' && letters [i] <= 'Z') {
                System.out.print(i + " ");
            }
        }
    }
}

