public class MaxMinOfArray {
    public static void main(String[] args) {
        int[] array = {15, 3, 9, 22, 7};
        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
