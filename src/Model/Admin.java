package Model;

public class Admin extends User {
    // Memanggil konstruktor User untuk menginisialisasi username dan password. 
    public Admin(String username, String password) {
        super(username, password);
    }
}