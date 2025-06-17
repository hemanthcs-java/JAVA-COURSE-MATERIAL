public class JavaNumberPrograms7 {

    public static void main(String[] args) {
        printUppercaseAlphabets();
        printLowercaseAlphabets();
        printFactorsOfNumber();
        printHCFOfTwoNumbers();
        printLCMOfTwoNumbers();
        printPrimeFactors();
    }

    // Q31: Print all uppercase alphabets A to Z
    static void printUppercaseAlphabets() {
        System.out.println("Q31: Uppercase Alphabets A-Z");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
    }

    // Q32: Print all lowercase alphabets a to z
    static void printLowercaseAlphabets() {
        System.out.println("Q32: Lowercase Alphabets a-z");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
    }

    // Q33: Print all factors of 28
    static void printFactorsOfNumber() {
        System.out.println("Q33: Factors of 28");
        int num = 28;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    // Q34: Print HCF (GCD) of 12 and 18
    static void printHCFOfTwoNumbers() {
        System.out.println("Q34: HCF of 12 and 18");
        int a = 12;
        int b = 18;
        int hcf = 1;

        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf + "\n");
    }

    // Q35: Print LCM of 12 and 18
    static void printLCMOfTwoNumbers() {
        System.out.println("Q35: LCM of 12 and 18");
        int a = 12;
        int b = 18;
        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM = " + max + "\n");
                break;
            }
            max++;
        }
    }

    // Q36: Find all prime factors of 60
    static void printPrimeFactors() {
        System.out.println("Q36: Prime Factors of 60");
        int num = 60;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num = num / i;
            }
        }
        System.out.println("\n");
    }
}
