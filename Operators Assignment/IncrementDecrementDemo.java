public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Original value: " + n);
        System.out.println("Pre-increment: " + (++n));
        System.out.println("Post-increment: " + (n++));
        System.out.println("After post-increment: " + n);
        System.out.println("Pre-decrement: " + (--n));
        System.out.println("Post-decrement: " + (n--));
        System.out.println("After post-decrement: " + n);
    }
}
