import java.util.Scanner;

public class CheckNumberMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num, counters[]= new int[10];

        System.out.println("Enter number: ");
        num = s.nextInt();

        while(num > 0){
            counters[num % 10]++;
            num /=10;
        }

        int max=0;
        for (int i = 1; i<10; i++){
            if (counters[i] > counters[max])
                max = i;
        }

        System.out.println("The digit that appears most is: "+ max );

    }
}
