package LLD.SRP;

public class UserController {
    private UserService service;
    public UserController(UserService service){
        this.service=service;
    }

    public boolean saveUser(String email,String password){
        if(service.registerUser(email,password)){
            return true;
        }
        return false;
    }
}
