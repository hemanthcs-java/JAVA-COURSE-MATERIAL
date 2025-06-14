public class Question10 {
    public static void main(String[] args) {
        char ch = '#';

        if (Character.isDigit(ch))
            System.out.println("Digit");
        else if (Character.isLetter(ch))
            System.out.println("Alphabet");
        else
            System.out.println("Special Character");
    }
}
