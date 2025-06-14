public class Question18 {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 10;

        if (a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
}
