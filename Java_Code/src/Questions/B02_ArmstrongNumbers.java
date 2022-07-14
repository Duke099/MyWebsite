package Questions;

public class B02_ArmstrongNumbers {
    public static void main(String[] args) {
//        int n = 153;
//        System.out.println(isArmstrong(n));

        for (int i =100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n>0) {
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

//        if (sum == original ) {
//            return true;
//        }
        //Alternative for if statement above
        return sum == original;
    }
}
