package src.sourceCode.session8.nested.test.ex2;

public class Library {

    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        if(bookCount >= books.length) {
            System.out.println("The library is full");
            return;
        }
        books[bookCount] = new Book(title, author);
        bookCount++;
    }

    public void showBooks() {
        for(int i = 0; i < bookCount; i++) {
            System.out.println(books[i].toString());
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

    }

}
