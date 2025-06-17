public class JavaPatternPrograms1 {

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
    }

    // Pattern 1: Numbers increasing by row
    static void pattern1() {
        System.out.println("Pattern 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 2: Alphabets increasing by row
    static void pattern2() {
        System.out.println("Pattern 2:");
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 3: Star triangle
    static void pattern3() {
        System.out.println("Pattern 3:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 4: Repeated numbers per row
    static void pattern4() {
        System.out.println("Pattern 4:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 5: Repeated letters per row
    static void pattern5() {
        System.out.println("Pattern 5:");
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
