class library {
    String[] books;
    int numberOfBooks;

    library() {
        this.books = new String[100];
        this.numberOfBooks = 0;
    }

    void addbooks(String novels) {

        this.books[numberOfBooks] = novels;
        numberOfBooks++;
        System.out.println(novels + " As a favbook has been added!");
    }

    void showavailblebooks() {
        System.out.println("Availble novels are: ");
        for (String novels : this.books) {
            if (novels == null) {
                continue;
            }
            System.out.println("*" + novels);

        }
    }

    void issuebook(String novels) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(novels)) { // Null check added{

                System.out.println(novels + " This book has been issued.");
                this.books[i] = null;
                return;
            }

        }
        System.out.println("This book does not exist");
    }

    void returnbook(String novels) {
        addbooks(novels);
    }

}

public class Library_Prac_ChV_51 {
    public static void main(String[] args) {

        library libobj = new library();
        libobj.addbooks("Rich dad poor dad");
        libobj.addbooks("Algorithim");
        libobj.addbooks("C/C++ language");
        libobj.showavailblebooks();
        libobj.issuebook("Algorithim");
        // libobj.issuebook("Algorithim");
        libobj.showavailblebooks();
        libobj.returnbook("Algorithim");
        libobj.showavailblebooks();
    }
}
