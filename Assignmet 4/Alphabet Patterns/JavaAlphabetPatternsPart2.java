public class JavaAlphabetPatternsPart2 {

    public static void main(String[] args) {
        pattern21(); System.out.println();
        pattern22(); System.out.println();
        pattern23(); System.out.println();
        pattern24(); System.out.println();
        pattern25(); System.out.println();
        pattern26(); System.out.println();
        pattern27(); System.out.println();
        pattern28(); System.out.println();
        pattern29(); System.out.println();
        pattern30(); System.out.println();
        pattern31(); System.out.println();
        pattern32(); System.out.println();
        pattern33(); System.out.println();
        pattern34(); System.out.println();
        pattern35(); System.out.println();
        pattern36(); System.out.println();
        pattern37(); System.out.println();
        pattern38(); System.out.println();
        pattern39(); System.out.println();
        pattern40(); System.out.println();
    }

    static void pattern21() {
        for (int i = 0; i < 6; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j < 6; j++) {
                if (j < 5 - i)
                    System.out.print('A');
                else
                    System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern22() {
        for (int i = 0; i <= 5; i++) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('E' + i); ch > (char) ('A' + i); ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern23() {
        for (int i = 0; i < 6; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(Character.toUpperCase(ch));
            }
            System.out.println();
        }
    }

    static void pattern24() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('V');
            }
            System.out.println();
        }
    }

    static void pattern25() {
        char ch = 'A';
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    static void pattern26() {
        for (int i = 0; i < 6; i++) {
            for (char ch = (char) ('A' + i); ch <= 'F'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern27() {
        for (int i = 0; i < 5; i++) {
            for (char ch = (char) ('A' + i); ch < 'A' + i + 5; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern28() {
        for (int i = 5; i >= 0; i--) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char) ('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern29() {
        for (int i = 0; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + 5 - i; ch++) {
                System.out.print(ch);
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(' ');
            }
            if (i != 0) {
                for (char ch = (char) ('A' + 5 - i); ch >= 'A'; ch--) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }

    static void pattern30() {
        for (int i = 0; i < 6; i++) {
            for (char ch = 'A'; ch <= 'A' + 5 - i; ch++) {
                System.out.print(ch);
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(' ');
            }
            if (i != 0) {
                for (char ch = (char) ('A' + 5 - i); ch >= 'A'; ch--) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 0; i--) {
            for (char ch = 'A'; ch <= 'A' + 5 - i; ch++) {
                System.out.print(ch);
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(' ');
            }
            if (i != 0) {
                for (char ch = (char) ('A' + 5 - i); ch >= 'A'; ch--) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }

    static void pattern31() {
        System.out.println("J");
        System.out.println("IH");
        System.out.println("GFE");
        System.out.println("DCBA");
    }

    static void pattern32() {
        char ch = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch + i + j));
            }
            System.out.println();
        }
    }

    static void pattern33() {
        for (int i = 0; i < 6; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern34() {
        for (int i = 0; i < 6; i++) {
            for (char ch = (char) ('A' + i); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern35() {
        char[][] arr = {
            {'A'},
            {'B', 'I'},
            {'C', 'H', 'J'},
            {'D', 'G', 'K', 'N'},
            {'E', 'F', 'L', 'M', 'O'}
        };
        for (char[] row : arr) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern36() {
        char[][] arr = {
            {'A', 'J', 'K', 'T', 'U'},
            {'B', 'I', 'L', 'S', 'V'},
            {'C', 'H', 'M', 'R', 'W'},
            {'D', 'G', 'N', 'Q', 'X'},
            {'E', 'F', 'O', 'P', 'Y'}
        };
        for (char[] row : arr) {
            for (char ch : row) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern37() {
        for (int i = 0; i < 5; i++) {
            for (char ch = 'E'; ch >= 'E' - i; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern38() {
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

    static void pattern39() {
        for (int i = 6; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern40() {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
