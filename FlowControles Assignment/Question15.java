public class Question15 {
    public static void main(String[] args) {
        char ch = 'm';

        if (Character.isUpperCase(ch))
            System.out.println("Uppercase");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase");
        else
            System.out.println("Not a letter");
    }
}
