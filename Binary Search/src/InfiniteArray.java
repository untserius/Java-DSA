public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {

        // first find the range (we need to find first the start and end.)
        // During binary search process, it divides the range by 2.
        // Here we'll do reverse. By doubling it.
        // suppose initially we start with array [1] -
        int start = 0;
        int end = 1;

        // conditions for the target to lie in the range.
        while (target > arr[end]) {
            int newStart = end + 1;

            // double the box value.
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
        }
    }
    return -1;
    }
}
