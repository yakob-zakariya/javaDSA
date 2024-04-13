package OOPPrinciples;

public class Teacher extends User{

    String role = "TEACHER";

    public String getRole() {
        return role;
    }

    @Override
    public void login(){
        System.out.println("Logged in");
        System.out.println("redirecting to Teacher dashboard ");
    }
}

