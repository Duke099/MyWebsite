package Questions;

public class MaxRange_Array {
    public static void main(String[] args) {
        int[] arr = {10, 205, 100, 915, 25};
        System.out.println(max(arr, 1, 4));
    }

    static int max(int[] arr, int start, int end) {

        int maxRange = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > maxRange) {
                maxRange = arr[i];
            }
        }
        return maxRange;
    }
}
