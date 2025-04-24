package Model;

import java.util.HashMap;
import java.util.Map;

public class Customer extends User {
    private Map<Saham, Integer> sahamDimiliki = new HashMap<>();
    private Map<SuratBerhargaNegara, Double> sbnDimiliki = new HashMap<>();

    public Customer(String username, String password) {
        super(username, password);
    }

    public Map<Saham, Integer> getSahamDimiliki() { return sahamDimiliki; }
    public Map<SuratBerhargaNegara, Double> getSbnDimiliki() { return sbnDimiliki; }
}
