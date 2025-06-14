public class Assignment5 {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 40;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        
        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;

        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}
