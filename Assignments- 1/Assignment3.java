public class Assignment3 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
