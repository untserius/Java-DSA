public class Reverse {
    public static void main(String[] args) {


// Q. Find the reverse of a no.

        int n = 21879;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
