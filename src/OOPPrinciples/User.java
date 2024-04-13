package OOPPrinciples;

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void login(){}

    public void save(){
        // hashing password then saving
        System.out.println(this.firstName + " " + this.lastName + " is saved successfully");
    }
}

