import java.util.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1,1,3,4,5};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {

        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
