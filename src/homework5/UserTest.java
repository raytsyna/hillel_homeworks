package homework5;

public class UserTest {
    public static void main(String[] args) {

        User user1 = new User();
        user1.userName = "Alex";
        user1.email = "alex@yopmail.com";
        user1.amountSpentMoney = 350.80d;
        user1.isActive = true;
        user1.setPassword("password");
        user1.setAge(6);

        User user2 = new User("Sam");
        user2.email = "sam@yopmail.com";
        user2.amountSpentMoney = 30.80d;
        user2.isActive = true;
        user2.setPassword("123456");
        user2.setAge(30);

        User user3 = new User("John", "freepass");
        user3.email = "john@yopmail.com";
        user3.amountSpentMoney = 350.80d;
        user3.isActive = false;
        user3.setAge(29);

        user1.makePurchase(100.0);
        user2.makePurchase(75.0);
        user3.makePurchase(200.0);

        System.out.println("name:" + user1.userName + " " + "email:" + user1.email + " " + "age:" + user1.getAge());
        user1.printTotalAmountOfSpentMoney();
        System.out.println("\n");

        System.out.println("name:" + user2.userName + " " + "email:" + user2.email + " " + "age:" + user2.getAge());
        user2.printTotalAmountOfSpentMoney();
        System.out.println("\n");

        System.out.println("name:" + user3.userName + " " + "email:" + user3.email + " " + "age:" + user3.getAge());
        user3.printTotalAmountOfSpentMoney();

    };
}
