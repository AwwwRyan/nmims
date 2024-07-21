import java.util.*;

class Book {
    private String name;
    private String author;
    private double price;
    private int copies;

    Book(String name, String author, double price, int copies) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.copies = copies;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    int getCopies() {
        return copies;
    }

    void setCopies(int copies) {
        this.copies = copies;
    }

    void displayBook() {
        System.out.println("name: " + name);
        System.out.println("author: " + author);
        System.out.println("price: " + price);
        System.out.println("copies: " + copies);
    }
}

public class Library {
    private ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        for (Book book : books) {
            book.displayBook();
            System.out.println();
        }
    }

    void searchBookByName(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                book.displayBook();
                return;
            }
        }
        System.out.println("book not found.");
    }

    public void searchBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                if (!found) {
                    found = true;
                }
                book.displayBook();
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("No books found");
        }
    }

    public void sortBooksByName() {
        for (int i = 0; i < books.size() - 1; i++) {
            for (int j = i + 1; j < books.size(); j++) {
                if (books.get(i).getName().compareTo(books.get(j).getName()) > 0) {
                    Book temp = books.get(i);
                    books.set(i, books.get(j));
                    books.set(j, temp);
                }
            }
        }
    }

    public void issueBook(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                if (book.getCopies() > 0) {
                    book.setCopies(book.getCopies() - 1);
                    System.out.println("book issued");
                } else {
                    System.out.println("no books available");
                }
                return;
            }
        }
        System.out.println("book not found");
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Copies: ");
            int copies = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(name, author, price, copies);
            library.addBook(book);
        }

        System.out.println();        
        System.out.println("books in the library: ");

        library.displayBooks();

        System.out.print("Enter the name of the book to search: ");
        String searchName = scanner.nextLine();
        library.searchBookByName(searchName);

        System.out.print("Enter the author name to search: ");
        String searchAuthor = scanner.nextLine();
        library.searchBooksByAuthor(searchAuthor);

        library.sortBooksByName();
        System.out.println("Books in the library after sorting:");
        library.displayBooks();

        System.out.print("Enter the name of the book to issue: ");
        String issueName = scanner.nextLine();
        library.issueBook(issueName);

        System.out.println("Books in the library after issuing:");
        library.displayBooks();
    }
}