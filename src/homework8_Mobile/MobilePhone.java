package homework8_Mobile;

abstract class MobilePhone implements Mobile {
    private String brand;

    public MobilePhone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " from " + brand + " phone");
    }

    public abstract void browseInternet();
}
