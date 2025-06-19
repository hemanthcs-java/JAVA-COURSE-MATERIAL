public class KSmallestElements {
    public static void main(String[] args) {
        int[] array = {15, 3, 9, 12, 5, 6};
        int k = 3;

        // Sort ascending
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Top " + k + " smallest elements:");
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
