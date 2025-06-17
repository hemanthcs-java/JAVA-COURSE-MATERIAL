public class JavaNumberPrograms6 {

    public static void main(String[] args) {
        printFibonacciSeries();
        printFibonacciUsingRecursion();
        printDigitFrequency();
        printAsciiCharacters();
        printAlphabetsAtoZ();
    }

    // Q26: Print Fibonacci series up to 10 numbers
    static void printFibonacciSeries() {
        System.out.println("Q26: Fibonacci Series (10 terms)");
        int a = 0, b = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("\n");
    }

    // Q27: Print Fibonacci series using recursion
    static void printFibonacciUsingRecursion() {
        System.out.println("Q27: Fibonacci Series using Recursion (10 terms)");
        for (int i = 0; i < 10; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println("\n");
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Q28: Frequency of digits in 122334
    static void printDigitFrequency() {
        System.out.println("Q28: Frequency of Digits in 122334");
        int number = 122334;
        int[] freq = new int[10];

        while (number > 0) {
            int digit = number % 10;
            freq[digit]++;
            number = number / 10;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " → " + freq[i] + " times");
            }
        }
        System.out.println();
    }

    // Q29: Print ASCII characters from 0 to 127
    static void printAsciiCharacters() {
        System.out.println("Q29: ASCII Characters from 0 to 127");
        for (int i = 0; i <= 127; i++) {
            System.out.println(i + " = " + (char)i);
        }
        System.out.println();
    }

    // Q30: Print all alphabets from a to z
    static void printAlphabetsAtoZ() {
        System.out.println("Q30: Alphabets from a to z");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
    }
}
