public class PrintArrayInReverse {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.print("Array in reverse: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
