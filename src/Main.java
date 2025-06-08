public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Мастер и Маргарита", "Булгагов");
        Book book2 = new Book("1984", "Оруэлл");

        library.addBook(book1);
        library.addBook(book2);

        User user1 = new User("Анна", 101);
        User user2 = new User("Иван" , 102);

        library.addUser(user1);
        library.addUser(user2);

        library.listBooks();

        library.rentBook(user1, book1);

        library.rentBook(user2, book1);

        library.returnBook(user1, book1);

        library.rentBook(user2, book1);

        library.listBooks();

        library.findBookByTitle("1984");

        library.findBookByTitle("Властелин колец");

        library.showBookStats();
    }
}
