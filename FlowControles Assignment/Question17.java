public class Question17 {
    public static void main(String[] args) {
        int month = 2;

        if (month == 2)
            System.out.println("28 or 29 days");
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30 days");
        else if (month >= 1 && month <= 12)
            System.out.println("31 days");
        else
            System.out.println("Invalid month");
    }
}
