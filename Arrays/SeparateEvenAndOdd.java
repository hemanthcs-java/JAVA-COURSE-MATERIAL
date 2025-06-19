public class SeparateEvenAndOdd {
    public static void main(String[] args) {
        int[] array = {3, 6, 9, 12, 15, 18};

        System.out.print("Even numbers: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
