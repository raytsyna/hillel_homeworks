package homework8_Mobile;

class Model extends MobilePhone {
    public Model(String brand) {
        super(brand);
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing internet on " + getBrand() + " phone");
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message to " + number + " from " + getBrand() + " phone");
        System.out.println("Message: " + message);
    }
}
