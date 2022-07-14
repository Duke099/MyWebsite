package Questions;
// How many times the particular number accur.
import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        int count = 0;
        while(n>0) {

            int rem = n%10;
            if (rem == r) {
                count++;
            }
            n = n/10;  // This eliminate the last number
        }
        System.out.println(count);




    }

}
