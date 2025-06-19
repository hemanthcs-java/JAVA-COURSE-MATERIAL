public class SortArrayDescending {
    public static void main(String[] args) {
        int[] array = {25, 5, 15, 10, 20};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.print("Sorted in descending order: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
