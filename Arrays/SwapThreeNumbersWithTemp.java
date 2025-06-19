public class SwapThreeNumbersWithTemp {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        int temp;

        System.out.println("Before swap: a=" + a + " b=" + b + " c=" + c);

        temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After swap: a=" + a + " b=" + b + " c=" + c);
    }
}
