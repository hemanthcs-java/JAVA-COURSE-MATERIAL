public class CollegeStudent {
    int studentId;
    String studentName;
    static String collegeName = "ABC University";

    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent();
        s1.studentId = 201;
        s1.studentName = "Tom";
        CollegeStudent s2 = new CollegeStudent();
        s2.studentId = 202;
        s2.studentName = "Jerry";

        System.out.println(s1.studentName + " - " + collegeName);
        System.out.println(s2.studentName + " - " + collegeName);
    }
}
