package main.java.lld.SOLID.srp.good;

public class UserService {
    private final UserValidator  validator= new UserValidator();
    private final UserRepository repository = new UserRepository();
    private final EmailService emailService = new EmailService();

    public void registerUser(String username, String email) {

        System.out.println("Registering user: " + username);

        validator.validate(email);
        repository.save(username, email);
        emailService.sendWelcomeEmail(email);
    }

}


