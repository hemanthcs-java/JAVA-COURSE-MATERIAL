public class JavaNumberPrograms2 {

    public static void main(String[] args) {
        printMultiplicationTable();
        countDigits();
        sumOfDigits();
        printNumbersInReverse();
        checkPrime();
    }

    // Q6: Print multiplication table of 5
    static void printMultiplicationTable() {
        System.out.println("Q6: Multiplication Table of 5");
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println();
    }

    // Q7: Count the digits of a number (12345)
    static void countDigits() {
        System.out.println("Q7: Count Digits of 12345");
        int number = 12345;
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        System.out.println("Total Digits = " + count + "\n");
    }

    // Q8: Print the sum of digits of a number (12345)
    static void sumOfDigits() {
        System.out.println("Q8: Sum of Digits of 12345");
        int number = 12345;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        System.out.println("Sum = " + sum + "\n");
    }

    // Q9: Print all natural numbers in reverse order from 10 to 1
    static void printNumbersInReverse() {
        System.out.println("Q9: Natural Numbers in Reverse from 10 to 1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // Q10: Check whether 29 is a Prime number
    static void checkPrime() {
        System.out.println("Q10: Check if 29 is a Prime Number");
        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("29 is a Prime Number\n");
        } else {
            System.out.println("29 is NOT a Prime Number\n");
        }
    }
}
