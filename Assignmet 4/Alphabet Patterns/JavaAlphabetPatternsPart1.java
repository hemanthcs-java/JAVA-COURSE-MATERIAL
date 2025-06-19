public class JavaAlphabetPatternsPart1 {

    public static void main(String[] args) {
        pattern1();  System.out.println();
        pattern2();  System.out.println();
        pattern3();  System.out.println();
        pattern4();  System.out.println();
        pattern5();  System.out.println();
        pattern6();  System.out.println();
        pattern7();  System.out.println();
        pattern8();  System.out.println();
        pattern9();  System.out.println();
        pattern10(); System.out.println();
        pattern11(); System.out.println();
        pattern12(); System.out.println();
        pattern13(); System.out.println();
        pattern14(); System.out.println();
        pattern15(); System.out.println();
        pattern16(); System.out.println();
        pattern17(); System.out.println();
        pattern18(); System.out.println();
        pattern19(); System.out.println();
        pattern20(); System.out.println();
    }

    static void pattern1() {
        for (int i = 0; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 0; i < 6; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern3() {
        for (int i = 0; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern4() {
        for (int i = 6; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = 1; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern5() {
        for (int i = 6; i >= 1; i--) {
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = 2; i <= 6; i++) {
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern6() {
        for (int i = 0; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern7() {
        for (int i = 6; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + 5 - j));
            }
            System.out.println();
        }
    }

    static void pattern8() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('F' - j));
            }
            System.out.println();
        }
    }

    static void pattern9() {
        for (int i = 6; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern10() {
        char ch = 'A';
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    static void pattern11() {
        for (int i = 1; i <= 6; i++) {
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern12() {
        char[][] arr = {
            {'A'},
            {'B', 'G'},
            {'C', 'H', 'M'},
            {'D', 'I', 'N', 'S'},
            {'E', 'J', 'O', 'T', 'Y'},
            {'F', 'K', 'P', 'U', 'Z', '_'}
        };
        for (char[] row : arr) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern13() {
        for (int i = 0; i < 6; i++) {
            char ch = (char) ('A' + i);
            System.out.print(ch);
            for (int j = 1; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            if (i > 0) System.out.print(ch);
            System.out.println();
        }
    }

    static void pattern14() {
        for (int i = 0; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern15() {
        for (int i = 6; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern16() {
        for (int i = 1; i <= 6; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern17() {
        for (int i = 0; i < 6; i++) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern18() {
        for (int i = 0; i < 6; i++) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        for (int i = 5; i >= 0; i--) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern19() {
        for (int i = 5; i >= 0; i--) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern20() {
        for (int i = 0; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
