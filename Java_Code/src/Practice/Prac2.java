package Practice;

public class Prac2 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        int target = 5;
        System.out.println(fibonacci(n1,n2,target));
    }

    static int fibonacci(int n1, int n2, int target) {
        int count = 1;
        int sum = 0;

        while (count < target) {
            sum = n1 + n2;

            n1 = n2;
            n2 = sum;
            count++;
        }
        return sum;
    }

}
