package homework8_Mobile;

public class Main {
    public static void main(String[] args) {
        Model model = new Model("Nokia");
        model.call("123456789");
        model.sendMessage("987654321", "Hello there!");
        model.browseInternet();
    }
}
