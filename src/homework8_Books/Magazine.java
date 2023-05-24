package homework8_Books;

class Magazine implements Printable {
    private String name;
    private int number;

    public Magazine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Printing magazine: " + name + ", Issue #" + number);
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                Magazine magazine = (Magazine) printable;
                magazine.print();
            }
        }
    }
}