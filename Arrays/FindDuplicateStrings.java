public class FindDuplicateStrings {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry", "apple", "banana"};

        System.out.println("Duplicate strings:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}
