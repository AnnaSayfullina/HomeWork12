package lesson12;

public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName(){
        return this.name;
    }
    public String getAuthor(){
        return author.getFirstName() + " " + author.getSurname();
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
}
