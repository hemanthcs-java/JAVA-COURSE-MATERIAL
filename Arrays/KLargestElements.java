public class KLargestElements {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 3, 9, 15};
        int k = 3;

        // Simple sorting
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Top " + k + " largest elements:");
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
