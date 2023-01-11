package lesson12;
public class Library {
    private Book[] allBooks = new Book[5];
    private int sizeArray;

    public Library(int sizeArray) {
        allBooks = new Book[sizeArray];
        this.sizeArray = sizeArray;
    }

    public void addBookToArray(Book nameBook) {
        for (int i = 0; i < allBooks.length; i++) {
            if (allBooks[i] == null) {
                allBooks[i] = nameBook;
                return;
            }
        }
    }
    public void printBook(Book[] nameBook) {
        for (int i = 0; i < nameBook.length; i++) {
            System.out.printf("%s: %s: %d%n", nameBook[i].getAuthor(), nameBook[i].getName(), nameBook[i].getYear());
        }
    }
    public void printInformationNameBook(Book[] nameBook, String nameOfBook) {
        for (int i = 0; i < nameBook.length; i++) {
            boolean equals = nameBook[i].getName().equals(nameOfBook);
            if (equals) {
                System.out.printf("Автор книга %s - %s. Книга была издана в %d%n", nameBook[i].getName(), nameBook[i].getAuthor(), nameBook[i].getYear());
            }
        }
    }
    public void changePublicationYear(Book[] nameBook, String nameOfBook, int newYear) {
        for (int i = 0; i < nameBook.length; i++) {
            boolean equals = nameBook[i].getName().equals(nameOfBook);
            if (equals) {
                nameBook[i].setYear(newYear);
                System.out.printf("Год публикации книги %s изменен на %d%n", nameBook[i].getName(), nameBook[i].getYear());
            }
        }
    }
    public Book[] getAllBooks(){ //пришлось создать геттер для нового массива, чтобы он был доступен из класса Library
        return allBooks;
    }
}
