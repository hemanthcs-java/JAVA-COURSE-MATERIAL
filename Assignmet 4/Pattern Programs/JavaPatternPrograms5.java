public class JavaPatternPrograms5 {

    public static void main(String[] args) {
        pattern21();
        pattern22();
        pattern23();
        pattern24();
        pattern25();
    }

    // Pattern 21: Alphabet block
    static void pattern21() {
        System.out.println("Pattern 21:");
        char ch = 'A';
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 22: Numeric pattern pyramid
    static void pattern22() {
        System.out.println("Pattern 22:");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 23: Alphabet triangle
    static void pattern23() {
        System.out.println("Pattern 23:");
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 24: Triangle with increasing numbers
    static void pattern24() {
        System.out.println("Pattern 24:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 25: Alphabet triangle
    static void pattern25() {
        System.out.println("Pattern 25:");
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
