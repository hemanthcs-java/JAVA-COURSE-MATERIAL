public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 8, 30};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second largest: " + second);
    }
}
