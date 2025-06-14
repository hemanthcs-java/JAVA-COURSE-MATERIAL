public class Question2 {
    public static void main(String[] args) {
        int a = 90, b = 85, c = 75;

        if (a > b && a > c)
            System.out.println("Max: " + a);
        else if (b > c)
            System.out.println("Max: " + b);
        else
            System.out.println("Max: " + c);
    }
}
