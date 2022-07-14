package MathsCodes;

// X-OR is used.
public class A3_FindUnique {

    public static void main(String[] args) {

        int[] arr = {-2,3,-4,2,5,-5,4};
        System.out.println(ans(arr));

    }

    public static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique += n;
        }
        return unique;
    }
}
