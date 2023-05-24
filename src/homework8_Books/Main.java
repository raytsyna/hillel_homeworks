package homework8_Books;


public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Book("Java for Dummies", "John Smith");
        printables[1] = new Magazine("Cosmopolitan", 123);
        printables[2] = new Book("Harry Potter", "J. K. Rowling");

        for (Printable printable : printables) {
            printable.print();
        }
        System.out.println("_______");

        Magazine.printMagazines(printables);

        System.out.println("_______");

        Book.printBooks(printables);
    }
    }

