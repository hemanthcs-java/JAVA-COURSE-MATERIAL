public class JavaNumberPrograms5 {

    public static void main(String[] args) {
        swapWithoutTemp();
        powerWithoutPow();
        powerWithoutPowAgain();
        powerWithMathPow();
        checkPalindrome();
    }

    // Q21: Swap two numbers without using third variable
    static void swapWithoutTemp() {
        System.out.println("Q21: Swap Without Using Temp Variable");
        int a = 10;
        int b = 20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: a = " + a + ", b = " + b + "\n");
    }

    // Q22: Calculate power of a number without using pow (example: 2^5)
    static void powerWithoutPow() {
        System.out.println("Q22: Power Without Using pow (2^5)");
        int base = 2;
        int exp = 5;
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println("2^5 = " + result + "\n");
    }

    // Q23: Another power example without pow (3^4)
    static void powerWithoutPowAgain() {
        System.out.println("Q23: Power Without Using pow (3^4)");
        int base = 3;
        int exp = 4;
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println("3^4 = " + result + "\n");
    }

    // Q24: Power using Math.pow (2^4)
    static void powerWithMathPow() {
        System.out.println("Q24: Power Using Math.pow (2^4)");
        int base = 2;
        int exp = 4;

        double result = Math.pow(base, exp);

        System.out.println("2^4 = " + result + "\n");
    }

    // Q25: Check if a number is a palindrome (121)
    static void checkPalindrome() {
        System.out.println("Q25: Check if 121 is a Palindrome");
        int num = 121;
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if (original == reversed) {
            System.out.println("121 is a Palindrome\n");
        } else {
            System.out.println("121 is NOT a Palindrome\n");
        }
    }
}
