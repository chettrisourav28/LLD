package main.java.lld.SOLID.srp.bad;

class UserService {

    public void registerUser(String username, String email) {
        // 1. Business logic
        System.out.println("Registering user: " + username);

        // 2. Validation logic
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }

        // 3. Persistence logic
        System.out.println("Saving user to database");

        // 4. Notification logic
        System.out.println("Sending welcome email");
    }
}


