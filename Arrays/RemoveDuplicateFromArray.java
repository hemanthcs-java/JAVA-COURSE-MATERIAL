public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 3, 1, 7};
        System.out.print("Unique elements: ");

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
