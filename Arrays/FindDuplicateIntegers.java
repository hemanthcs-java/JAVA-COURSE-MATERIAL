public class FindDuplicateIntegers {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 2, 4, 8};

        System.out.println("Duplicate values:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}
