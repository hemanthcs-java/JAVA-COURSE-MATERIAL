public class JavaPatternPrograms2 {

    public static void main(String[] args) {
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
    }

    // Pattern 6: Right-aligned stars
    static void pattern6() {
        System.out.println("Pattern 6:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) System.out.print(" ");
            for (int k = 1; k <= i; k++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 7: Number triangle
    static void pattern7() {
        System.out.println("Pattern 7:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 8: Reverse pyramid numbers
    static void pattern8() {
        System.out.println("Pattern 8:");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 9: Alphabet triangle
    static void pattern9() {
        System.out.println("Pattern 9:");
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 10: Reverse alphabet triangle
    static void pattern10() {
        System.out.println("Pattern 10:");
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = i; j <= 'E'; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }
}
