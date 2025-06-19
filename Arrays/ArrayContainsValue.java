public class ArrayContainsValue {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int valueToCheck = 5;
        boolean found = false;

        for (int num : array) {
            if (num == valueToCheck) {
                found = true;
                break;
            }
        }

        System.out.println("Is value present? " + found);
    }
}
