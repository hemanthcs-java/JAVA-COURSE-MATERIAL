public class SumCalculator {
    int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        SumCalculator obj = new SumCalculator();
        System.out.println("Sum: " + obj.add(10, 20));
    }
}
