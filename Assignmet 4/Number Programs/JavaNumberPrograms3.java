public class JavaNumberPrograms3 {

    public static void main(String[] args) {
        printPrimeNumbers();
        sumOfPrimeNumbers();
        checkArmstrong();
        printArmstrongNumbers();
        checkPerfectNumber();
    }

    // Q11: Print all prime numbers from 1 to 50
    static void printPrimeNumbers() {
        System.out.println("Q11: Prime Numbers from 1 to 50");
        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    // Q12: Find sum of all prime numbers from 1 to 50
    static void sumOfPrimeNumbers() {
        System.out.println("Q12: Sum of Prime Numbers from 1 to 50");
        int sum = 0;
        for (int num = 2; num <= 50; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
            }
        }
        System.out.println("Sum = " + sum + "\n");
    }

    // Q13: Check if 153 is an Armstrong number
    static void checkArmstrong() {
        System.out.println("Q13: Check if 153 is an Armstrong Number");
        int num = 153;
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("153 is an Armstrong Number\n");
        } else {
            System.out.println("153 is NOT an Armstrong Number\n");
        }
    }

    // Q14: Print all Armstrong numbers from 1 to 1000
    static void printArmstrongNumbers() {
        System.out.println("Q14: Armstrong Numbers from 1 to 1000");
        for (int num = 1; num <= 1000; num++) {
            int temp = num;
            int sum = 0;
            while (temp != 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    // Q15: Check if 28 is a Perfect Number
    static void checkPerfectNumber() {
        System.out.println("Q15: Check if 28 is a Perfect Number");
        int num = 28;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("28 is a Perfect Number\n");
        } else {
            System.out.println("28 is NOT a Perfect Number\n");
        }
    }
}
