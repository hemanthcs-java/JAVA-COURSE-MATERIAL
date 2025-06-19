public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25};

        System.out.print("Reversed array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
