public class CompoundAssignmentDemo {
    public static void main(String[] args) {
        int x = 20;

        x += 5;
        System.out.println("After += 5: " + x);

        x -= 3;
        System.out.println("After -= 3: " + x);

        x *= 2;
        System.out.println("After *= 2: " + x);

        x /= 4;
        System.out.println("After /= 4: " + x);

        x %= 3;
        System.out.println("After %= 3: " + x);
    }
}
