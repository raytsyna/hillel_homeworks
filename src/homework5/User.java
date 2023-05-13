package homework5;

public class User {

    public String userName;
    private int age;
    public String email;
    private String password;
    public double amountSpentMoney;
    public boolean isActive;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error! Age cannot be a negative number!");
        }
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
        } else {
            System.out.println("Password must be at least 6 characters");
        }
    }

    public void makePurchase(double purchasePrice) {
        this.amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Total amount of spent money: " + this.amountSpentMoney + " $");
    }

    public void addDiscount(int percent) {
        double discount = this.amountSpentMoney * percent / 100.0;
        this.amountSpentMoney -= discount;
        System.out.println("Discount of " + percent + "% was applied. New amount spent: " + this.amountSpentMoney);
    }


}

