package homework9_Shapes;

public enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String hexCode;

    private Color(String hexCode) {
        this.hexCode = hexCode;
    }

    @Override
    public String toString() {
        return name() + " (" + hexCode + ")";
    }

    public String getHexCode() {
        return hexCode;
    }
}

