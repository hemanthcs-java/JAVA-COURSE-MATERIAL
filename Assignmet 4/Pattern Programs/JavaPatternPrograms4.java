public class JavaPatternPrograms4 {

    public static void main(String[] args) {
        pattern16();
        pattern17();
        pattern18();
        pattern19();
        pattern20();
    }

    // Pattern 16: Reverse number triangle
    static void pattern16() {
        System.out.println("Pattern 16:");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 17: Incremental numbers in triangle
    static void pattern17() {
        System.out.println("Pattern 17:");
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 18: Reverse triangle of characters
    static void pattern18() {
        System.out.println("Pattern 18:");
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 19: Reverse alphabets
    static void pattern19() {
        System.out.println("Pattern 19:");
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 20: Reverse letters by row
    static void pattern20() {
        System.out.println("Pattern 20:");
        for (char i = 'E'; i >= 'A'; i--) {
            for (char j = 'E'; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
