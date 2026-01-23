package main.java.lld.SOLID.srp.good;

class UserValidator {

    public void validate(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email");
        }
    }
}

