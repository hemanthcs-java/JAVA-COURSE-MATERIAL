public class JavaPatternPrograms8 {

    public static void main(String[] args) {
        pattern36();
        pattern37();
        pattern38();
        pattern39();
        pattern40();
    }

    // Pattern 36: Repeating numbers per row
    static void pattern36() {
        System.out.println("Pattern 36:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 37: Increasing letters with repeated character
    static void pattern37() {
        System.out.println("Pattern 37:");
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= 'E'; j++) {
                if (j <= i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 38: Number triangle
    static void pattern38() {
        System.out.println("Pattern 38:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 39: Alphabet triangle
    static void pattern39() {
        System.out.println("Pattern 39:");
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 40: Inverted star pyramid
    static void pattern40() {
        System.out.println("Pattern 40:");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
