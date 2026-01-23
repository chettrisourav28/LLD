package main.java.lld.SOLID.srp.good;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("Sourav", "sourav@gmail.com");
    }
}
