public class Circle {
    double radius = 7.0;

    void printArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }

    void printCircumference() {
        double circumference = 2 * 3.14 * radius;
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.printArea();
        circle.printCircumference();
    }
}
