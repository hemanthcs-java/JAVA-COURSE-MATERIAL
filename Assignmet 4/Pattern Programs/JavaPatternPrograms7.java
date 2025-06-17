public class JavaPatternPrograms7 {

    public static void main(String[] args) {
        pattern31();
        pattern32();
        pattern33();
        pattern34();
        pattern35();
    }

    // Pattern 31: Reverse alphabet pyramid
    static void pattern31() {
        System.out.println("Pattern 31:");
        for (int i = 5; i >= 1; i--) {
            for (char j = (char) ('A' + i - 1); j >= 'A'; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 32: Symmetric star pyramid
    static void pattern32() {
        System.out.println("Pattern 32:");
        for (int i = 1; i <= 5; i++) {
            for (int s = 5 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 33: Number pyramid centered
    static void pattern33() {
        System.out.println("Pattern 33:");
        for (int i = 1; i <= 3; i++) {
            for (int s = 3 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = i - 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 34: Alphabet diamond top-down
    static void pattern34() {
        System.out.println("Pattern 34:");
        for (char i = 'A'; i <= 'D'; i++) {
            for (char j = 'A'; j <= i; j++) System.out.print(j);
            for (char j = (char)(i - 1); j >= 'A'; j--) System.out.print(j);
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 35: Diagonal 1 to 5
    static void pattern35() {
        System.out.println("Pattern 35:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) System.out.print(i + 1);
                else System.out.print("0");
            }
            System.out.println();
        }
        System.out.println();
    }
}
