import java.util.Scanner;
public class favoriteDay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final  int EXIT = -1;
        int daysFrequency [] = new int [7],day,maxDayIndex;

        do {
            System.out.print("Insert the day you like most <1-7>, -1 to EXIT: ");
            day = s.nextInt();
            if(day != EXIT){
                daysFrequency[day-1]++;
            }
        }while (day != EXIT);
        System.out.println("Each day and number of persons who liked it most: ");
        for (int i = 1; i<=7; i++)
            System.out.printf("%d: %d\n", i,daysFrequency[i - 1]);

        maxDayIndex=0;
        for (int i=1; i<7; i++){
            if (daysFrequency[i]>daysFrequency[maxDayIndex]){
                maxDayIndex = i;
            }
        }
        System.out.println("The favorite day is: " + (maxDayIndex+1));
    }
}
