package Questions;
// This Question is on checking uppercase or lowercase of a 1st letter of input word.
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().trim().charAt(0);
//        trim() = removes all spaces between words; charAt() = takes the specified word in bracket - In bracket we write number from (0 - infinity)
        if (c >= 'a' && c <= 'z') {
            System.out.println("LowerCase");
        } else
            System.out.println("UpperCase");
//            && - and; || - OR; != not equal to;

    }
}
