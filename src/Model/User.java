package Model;

public class User {
    private String username;
    private String password;
    
    // Menginisialisasi username dan password
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}