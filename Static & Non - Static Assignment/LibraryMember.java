public class LibraryMember {
    int memberId;
    String memberName;
    int booksBorrowed;

    void borrowBooks(int count) {
        int maxAllowed = 5;
        if (booksBorrowed + count <= maxAllowed) {
            booksBorrowed += count;
            System.out.println("Books borrowed: " + booksBorrowed);
        } else {
            System.out.println("Cannot borrow more than 5 books");
        }
    }

    public static void main(String[] args) {
        LibraryMember member = new LibraryMember();
        member.memberId = 301;
        member.memberName = "Emma";
        member.booksBorrowed = 2;
        member.borrowBooks(2);
    }
}
