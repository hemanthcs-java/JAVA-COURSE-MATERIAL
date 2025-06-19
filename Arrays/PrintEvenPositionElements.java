public class PrintEvenPositionElements {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66};

        System.out.println("Elements at even positions (index starts from 0):");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Index " + i + ": " + array[i]);
            }
        }
    }
}
