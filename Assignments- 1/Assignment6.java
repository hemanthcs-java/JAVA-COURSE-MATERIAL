public class Assignment6 {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 40;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        
        a = a + b + c + d;
        b = a - (b + c + d); // b = original a
        c = a - (b + c + d); // c = original b
        d = a - (b + c + d); // d = original c
        a = a - (b + c + d); // a = original d

        System.out.println("After Swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
    }
}
