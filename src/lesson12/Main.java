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

 * Средний уровень
 * 1. Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
 * 2. Написать статические методы для работы с массивом в классе, где располагается метод main:
 *     1. Добавить книгу (найти свободную ячейку массива и положить туда книгу).
 *     Учесть, что этот метод может быть вызван любое количество раз (от 1 до 5) и
 *     каждая новая книга должна успешно укладываться в массив.
 *     2. Напечатать в консоль все книги из массива в следующем формате:
 *         “Stephen King: The Stand: 1978”

 *         ## Сложный уровень
  * 1. Создать класс Library, который будет иметь своим полем массив из прошлого уровня.
 *     Учесть, что доступ к нему должен быть только из Library (private поле), а сеттеры и геттеры отсутствуют.
 *     Работать с массивом можно только через внутренние нестатические методы класса Library.
 * 2. Конструктор класса должен получать в качестве параметра размер массива и инициализировать в себе поле
 *      массива тем размером, что пришел параметром.
 * 3. Перенести методы из прошлого уровня в класс Library, сделать их нестатическими.
 * 4. Создать новые нестатические методы в классе Library:
 *     1. Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
 *         Формат: “The Stand by Stephen King was published in 1978”
 *     2. Изменить год публикации книги по ее названию.
 *         В метод подаются два параметра, а именно: название и новый год публикации.
 *         Нужно найти книгу и изменить ее год публикации.
 * - **Критерии оценки**
 *     1. Класс Library создан корректно.
 *     2. Массив корректно перенесен в виде поля в класс Library.
 *     3. Конструктор класса Library написан корректно.
 *     4. Корректно перенесены методы, модификатор static удален.
 *     5. Объявлены новые методы.
 *     6. Методы корректно справляются со своей задачей.
 */
public class Main {
    public static Book[] allBooks = new Book[5];
    public static void addBookToArray(Book nameBook) {
        for (int i = 0; i < allBooks.length; i++){
            if (allBooks[i] == null) {
                allBooks[i] = nameBook;
            return;
            }
        }
    }
    public static void printBook (Book[]  nameBook) {
        for (int i = 0; i < nameBook.length; i++) {
            System.out.printf("%s: %s: %d%n", nameBook[i].getAuthor(), nameBook[i].getName(), nameBook[i].getYear());
        }
    }
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

        System.out.println();
        System.out.println("Задание Средний уровень");

        Author johnTolkien = new Author("Джон", "Толкин");
        Book lordOfTheRings = new Book("Властелин колец", johnTolkien, 2016);
        Book hobbit = new Book("Хоббит, или туда и обратно", johnTolkien, 2018);
        Author pushkin = new Author("Александр", "Пушкин");
        Book queenOfSpades = new Book("Пиковая дама", pushkin, 2014);

        addBookToArray(harryPotter);
        addBookToArray(hisDarkMaterials);
        addBookToArray(lordOfTheRings);
        addBookToArray(hobbit);
        addBookToArray(queenOfSpades);
        printBook(allBooks);
        System.out.println();

        System.out.println("Сложный уровень");
        Library libraries= new Library(6);
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", levTolstoy, 2019);
        libraries.addBookToArray(warAndPeace); //пришлось заново вызывать методы и заполнять массив. Чувствую, что
        // ошибка где-то в конструкторе(массив allBooks почему-то по итогу не копируется из класса Main). Не понимаю как исправить.
        libraries.addBookToArray(harryPotter);
        libraries.addBookToArray(hobbit);
        libraries.addBookToArray(lordOfTheRings);
        libraries.addBookToArray(hisDarkMaterials);
        libraries.addBookToArray(queenOfSpades);

        libraries.printBook(libraries.getAllBooks());
        System.out.println();
        libraries.printInformationNameBook(libraries.getAllBooks(), "Гарри Поттер");
        System.out.println();
        libraries.changePublicationYear(libraries.getAllBooks(),"Пиковая дама", 2023);
    }

}
