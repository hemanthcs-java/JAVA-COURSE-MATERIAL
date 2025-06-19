public class CommonElementsInStringArrays {
    public static void main(String[] args) {
        String[] array1 = {"red", "blue", "green", "yellow"};
        String[] array2 = {"green", "yellow", "black"};

        System.out.println("Common elements:");
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s1.equals(s2)) {
                    System.out.println(s1);
                }
            }
        }
    }
}
