public class JavaNumberPrograms4 {

    public static void main(String[] args) {
        printPerfectNumbers();
        checkStrongNumber();
        printStrongNumbers();
        swapFirstAndLastDigit();
        swapWithTempVariable();
    }

    // Q16: Print all perfect numbers from 1 to 1000
    static void printPerfectNumbers() {
        System.out.println("Q16: Perfect Numbers from 1 to 1000");
        for (int num = 1; num <= 1000; num++) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    // Q17: Check if 145 is a Strong Number
    static void checkStrongNumber() {
        System.out.println("Q17: Check if 145 is a Strong Number");
        int num = 145;
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println("145 is a Strong Number\n");
        } else {
            System.out.println("145 is NOT a Strong Number\n");
        }
    }

    // Q18: Print all Strong numbers from 1 to 1000
    static void printStrongNumbers() {
        System.out.println("Q18: Strong Numbers from 1 to 1000");
        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }
                sum += fact;
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    // Q19: Swap first and last digit of 12345
    static void swapFirstAndLastDigit() {
        System.out.println("Q19: Swap First and Last Digit of 12345");
        int number = 12345;
        String str = Integer.toString(number);

        if (str.length() <= 1) {
            System.out.println("Result: " + str + "\n");
            return;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        String middle = str.substring(1, str.length() - 1);
        String swapped = last + middle + first;

        System.out.println("Swapped Number = " + swapped + "\n");
    }

    // Q20: Swap two numbers using third variable
    static void swapWithTempVariable() {
        System.out.println("Q20: Swap Two Numbers Using Temp Variable");
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b + "\n");
    }
}
