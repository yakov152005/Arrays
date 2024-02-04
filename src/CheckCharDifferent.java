import java.util.Scanner;

public class CheckCharDifferent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int  count=0;
        char[] str= new char[10];
        boolean hasAppear = false;

        System.out.printf("Please enter %d chars: ",str.length);
        for (int i = 0; i< str.length;i++)
            str[i]=s.next().charAt(0);

        System.out.println("The Chars are: ");
        for (int i =0; i<str.length; i++) {
            hasAppear = false;
            for (int j=0; j<i && !hasAppear; j++){
                if (str[i]==str[j])
                    hasAppear=true;
            }
            if (!hasAppear) {
                System.out.print(str[i]);
                count++;
            }
        }
        System.out.printf("\nThere were %d different letters\n", count);
    }
}
