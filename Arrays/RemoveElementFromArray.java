public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int removeValue = 30;

        System.out.print("Array after removal: ");
        for (int num : array) {
            if (num != removeValue) {
                System.out.print(num + " ");
            }
        }
    }
}
