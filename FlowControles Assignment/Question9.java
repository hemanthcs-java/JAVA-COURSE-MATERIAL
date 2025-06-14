public class Question9 {
    public static void main(String[] args) {
        char ch = 'K';

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("It's an alphabet");
        else
            System.out.println("Not an alphabet");
    }
}
