package lesson12;

/**
 * Задание
 * Напишите небольшой библиотечный справочник, где хранится информация о книгах.

 * Рекомендуем создать отдельный класс, например с именем Main или App — в нем объявить метод main и в нем протестировать работу вашего кода.

 * Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
 * Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
 * Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
 * Напишите конструкторы для обоих классов, заполняющие все поля.
 * Создайте геттеры для всех полей автора и всех полей книги.
 * Создайте сеттер для поля «Год публикации» у книги.
 * В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор»
 * (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и
 * книги не могут создаваться без авторов.
 * Метод main не должен находиться в классах Book и Author.

 * Создайте отдельный класс для запуска приложения и объявите метод main в нем.
 
 * В том же методе main измените год публикации одной из книг с помощью сеттера.
 * Так как вы изучили геттеры и сеттеры, оставлять поля открытыми, без модификатора доступа private, недопустимо.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание");
        Author joanneRowling = new Author("Джоан", "Роллинг");
        Book harryPotter = new Book("Гарри Поттер", joanneRowling, 2005);
        Author philipPullman = new Author("Филип", "Пулман");
        Book hisDarkMaterials = new Book("Темные начала. Северное сияние", philipPullman, 2010);
        System.out.println(harryPotter.getName() +", " + harryPotter.getAuthor() + ", " + harryPotter.getYear());
        System.out.println(hisDarkMaterials.getName() +", " + hisDarkMaterials.getAuthor() + ", " + hisDarkMaterials.getYear());
        harryPotter.setYear(2022);
        System.out.println(harryPotter.getName() +", " + harryPotter.getAuthor() + ", " + harryPotter.getYear());
    }
}
