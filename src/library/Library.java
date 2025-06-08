package library;

import java.util.ArrayList;
import java.util.List;

    public class Library {
        private List<Book> books;
        private List<User> users;


        public Library() {
            books = new ArrayList<>();
            users = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
        }

        public void addUser(User user) {
            users.add(user);
        }

        public void listBooks() {
            System.out.println("Список книг в библиотеки: ");
            for (Book book : books) {
                System.out.println(book);
            }
        }

        public void listUser() {
            System.out.println("Список пользователей: ");
            for (User user : users) {
                System.out.println(users);
            }
        }

        public void rentBook(User user, Book book) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(user.getName() + " взял книгу: " + book.getTitle());
            } else {
                System.out.println("Книга уже занята: " + book.getTitle());
            }
        }

        public void returnBook(User user, Book book) {
            if (!book.isAvailable()) {
                book.setAvailable(true);
                System.out.println(user.getName() + " вернул книгу: " + book.getTitle());
            } else {
                System.out.println("Книга уже находится в библиотеке: " + book.getTitle());
            }
        }

        public void findBookByTitle(String searchTitle) {
            boolean found = false;
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(searchTitle)) {
                    System.out.println("Найдена книга: " + book);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Книга с названием \"" + searchTitle + "\" не найдена.");
            }
        }

        public void showBookStats() {
            int avauilableCount = 0;
            int rentedCount = 0;

            for (Book book : books) {
                if (book.isAvailable()) {
                    avauilableCount++;
                } else {
                    rentedCount++;
                }
            }

            System.out.println("Статистика книг:");
            System.out.println("Доступных: " + avauilableCount);
            System.out.println("Занятых: " +rentedCount);
        }
    }