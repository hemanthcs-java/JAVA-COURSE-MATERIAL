public class MixedOperatorsEvaluation {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 12;

        boolean result = (a + b > c) && (b != 0);
        System.out.println("Result of (a + b > c) && (b != 0): " + result);
    }
}
