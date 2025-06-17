public class JavaNumberPrograms {

    public static void main(String[] args) {
        printNaturalNumbers();
        printEvenNumbers();
        printOddNumbers();
        printSumOfEvenNumbers();
        printSumOfOddNumbers();
    }

    // Q1: Print all natural numbers from 1 to 10
    static void printNaturalNumbers() {
        System.out.println("Q1: Natural Numbers from 1 to 10");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // Q2: Print all even numbers from 1 to 100
    static void printEvenNumbers() {
        System.out.println("Q2: Even Numbers from 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    // Q3: Print all odd numbers from 1 to 100
    static void printOddNumbers() {
        System.out.println("Q3: Odd Numbers from 1 to 100");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    // Q4: Print sum of even numbers from 1 to 10
    static void printSumOfEvenNumbers() {
        System.out.println("Q4: Sum of Even Numbers from 1 to 10");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum + "\n");
    }

    // Q5: Print sum of odd numbers from 1 to 10
    static void printSumOfOddNumbers() {
        System.out.println("Q5: Sum of Odd Numbers from 1 to 10");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum + "\n");
    }
}
