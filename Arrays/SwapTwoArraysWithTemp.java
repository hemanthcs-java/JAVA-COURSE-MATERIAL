public class SwapTwoArraysWithTemp {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        System.out.println("Before swap:");
        printArrays(a, b);

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }

        System.out.println("After swap:");
        printArrays(a, b);
    }

    static void printArrays(int[] a, int[] b) {
        System.out.print("Array A: ");
        for (int x : a) System.out.print(x + " ");
        System.out.print("\nArray B: ");
        for (int x : b) System.out.print(x + " ");
        System.out.println();
    }
}
