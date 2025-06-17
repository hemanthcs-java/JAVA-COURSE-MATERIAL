public class JavaPatternPrograms3 {

    public static void main(String[] args) {
        pattern11();
        pattern12();
        pattern13();
        pattern14();
        pattern15();
    }

    // Pattern 11: Right-aligned stars (ascending)
    static void pattern11() {
        System.out.println("Pattern 11:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 12: Repeated numbers by row count
    static void pattern12() {
        System.out.println("Pattern 12:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(i + " ");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 13: Repeated alphabets by row count
    static void pattern13() {
        System.out.println("Pattern 13:");
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print(ch + " ");
            ch++;
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 14: Descending length number pattern
    static void pattern14() {
        System.out.println("Pattern 14:");
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 15: Reverse number pyramid
    static void pattern15() {
        System.out.println("Pattern 15:");
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
    }
}
