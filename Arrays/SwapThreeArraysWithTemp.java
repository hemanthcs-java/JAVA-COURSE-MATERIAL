public class SwapThreeArraysWithTemp {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = {5, 6};

        System.out.println("Before swap:");
        printArrays(a, b, c);

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = c[i];
            c[i] = temp;
        }

        System.out.println("After swap:");
        printArrays(a, b, c);
    }

    static void printArrays(int[] a, int[] b, int[] c) {
        System.out.print("Array A: ");
        for (int x : a) System.out.print(x + " ");
        System.out.print("\nArray B: ");
        for (int x : b) System.out.print(x + " ");
        System.out.print("\nArray C: ");
        for (int x : c) System.out.print(x + " ");
        System.out.println();
    }
}
