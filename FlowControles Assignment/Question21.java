public class Question21 {
    public static void main(String[] args) {
        int maths = 85, physics = 80, chemistry = 78, english = 88, hindi = 92;
        double total = maths + physics + chemistry + english + hindi;
        double percentage = (total / 500) * 100;

        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 80)
            System.out.println("Grade B");
        else if (percentage >= 70)
            System.out.println("Grade C");
        else if (percentage >= 60)
            System.out.println("Grade D");
        else if (percentage >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }
}
