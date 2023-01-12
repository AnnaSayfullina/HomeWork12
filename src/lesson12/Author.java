package lesson12;

import java.util.Objects;

public class Author {
    private String firstName;
    private String surname;

    public Author(String firstName, String surname){
        this.firstName = firstName;
        this.surname = surname;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSurname(){
        return surname;
    }
    @Override
    public String toString(){
        return this.firstName + " " + this.surname;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return firstName.equals(author.firstName) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname);
    }
}
