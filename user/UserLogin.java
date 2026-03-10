package user;
public class UserLogin {
    public String UL(String name, int pass){
        if(UserDB.users.containsKey(name) && UserDB.users.get(name)==pass){
            System.out.println("Login Successful");
            return name;
        }
        System.out.println("Invalid User");
        return null;
    }
}
