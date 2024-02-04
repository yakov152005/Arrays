import java.util.Scanner;

public class Check {
    //בדיקת ממוצע
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num, sum=0, newNum=0, avg=0;

        do {
            System.out.println("Enter a numbers for avg: -1 for exit");
            num = s.nextInt();
            if (num != -1) {
                sum++;
                newNum += num;
            }
        }while (num != -1);
        avg = newNum/sum;
        System.out.println("Your avg is: " + avg);
    }
}
