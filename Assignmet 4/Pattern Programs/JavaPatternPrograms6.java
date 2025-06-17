public class JavaPatternPrograms6 {

    public static void main(String[] args) {
        pattern26();
        pattern27();
        pattern28();
        pattern29();
        pattern30();
    }

    // Pattern 26: Right-aligned increasing stars
    static void pattern26() {
        System.out.println("Pattern 26:");
        for (int i = 1; i <= 5; i++) {
            for (int s = 5; s > i; s--) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 27: Pyramid of stars
    static void pattern27() {
        System.out.println("Pattern 27:");
        for (int i = 1; i <= 5; i++) {
            for (int s = 5 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 28: Number triangle
    static void pattern28() {
        System.out.println("Pattern 28:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 29: Number pyramid
    static void pattern29() {
        System.out.println("Pattern 29:");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 30: Alphabet pyramid
    static void pattern30() {
        System.out.println("Pattern 30:");
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }
}
