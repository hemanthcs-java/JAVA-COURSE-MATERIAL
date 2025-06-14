public class Assignment4 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Swap without temp by using arithmetic (rotation)
        a = a + b + c;
        b = a - (b + c); // b = a
        c = a - (b + c); // c = b
        a = a - (b + c); // a = c

        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
