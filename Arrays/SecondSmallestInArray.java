public class SecondSmallestInArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 5, 8, 30};
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                second = smallest;
                smallest = num;
            } else if (num < second && num != smallest) {
                second = num;
            }
        }

        System.out.println("Second smallest: " + second);
    }
}
