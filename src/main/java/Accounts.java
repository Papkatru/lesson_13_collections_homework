import java.util.HashMap;
import java.util.Map;

public class Accounts {

    Map<Integer, String> mapOfAccounts = new HashMap<>();

    public void addNewAccount(int id, String account) {
        mapOfAccounts.put(id, account);
    }

    public void deleteAccount(String account) {
        mapOfAccounts.remove(account);
    }

    public void showAllAccounts() {
        for (Map.Entry<Integer, String> entry : mapOfAccounts.entrySet()) {
            System.out.println("Аккаунт " + entry.getKey() + "  " + entry.getValue());
        }
    }
}
