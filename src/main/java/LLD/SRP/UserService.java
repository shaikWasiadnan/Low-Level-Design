package LLD.SRP;

public class UserService {
    private UserRepo repo;
    private UserUtil emailService;
    public UserService(UserRepo repo,UserUtil emailService){
        this.repo=repo;
        this.emailService=emailService;
    }
    public boolean registerUser(String username,String password){
        if(password.length() < 6){
            System.out.println("Password is too short..");
            return false;
        }
        repo.saveUser(username,password);
        emailService.sendEmail(username);
        return true;
    }
}
