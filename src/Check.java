import java.util.Scanner;

public class Check {
    public static void main(String[] args){
        // int [] gradesArray = {32, 54, 34};
        //double average = calculateAverage(gradesArray);
        // System.out.println("This average is: " + average);
        gradeArray();

    }
    public static int getInput (){
        Scanner s =new Scanner(System.in);
        return  s.nextInt();
    }

    public static double calculateAverage(int [] grades){
        int sum = 0;
        for (int i = 0 ; i<grades.length; i++){
            sum += grades[i];
        }
        return (double) sum/grades.length;
    }
    public static void gradeArray (){
        int arraySize = 60;
        int [] gradesArray = new int[arraySize];
        for (int i = 0 ; i <arraySize; i++) {
            gradesArray[i] = i;
        }
            double average = calculateAverage(gradesArray);
            System.out.println("This average is: " + average);
        }

    }

