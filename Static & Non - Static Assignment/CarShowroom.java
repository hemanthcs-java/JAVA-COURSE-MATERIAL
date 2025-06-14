public class CarShowroom {
    String model;
    double price;
    static int carCount = 0;

    CarShowroom(String m, double p) {
        model = m;
        price = p;
        carCount++;
    }

    public static void main(String[] args) {
        new CarShowroom("Sedan", 25000);
        new CarShowroom("SUV", 30000);
        System.out.println("Total Cars: " + carCount);
    }
}
