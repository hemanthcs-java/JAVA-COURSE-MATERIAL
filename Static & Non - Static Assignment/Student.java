public class Student {
    String name;
    int m1, m2, m3;

    void calculateAverage() {
        double avg = (m1 + m2 + m3) / 3.0;
        System.out.println("Average Marks: " + avg);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ravi";
        s.m1 = 85;
        s.m2 = 90;
        s.m3 = 80;
        s.calculateAverage();
    }
}
