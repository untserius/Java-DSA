import java.util.Arrays;

public class ChangeUsingFunction {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int change(int[] xyz) {

        xyz[0] = 99;
        return xyz[0];
    }
}
