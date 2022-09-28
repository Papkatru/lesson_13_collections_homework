import java.util.ArrayList;
import java.util.List;

public class Users {

    List<String> listOfUsers = new ArrayList<>();

    public void addNewUser(String username) {
        listOfUsers.add(username);
    }

    public void deleteUser(String username) {
        listOfUsers.remove(username);
    }

    public void showAllUsers() {
        for (int i = 0; i < listOfUsers.size(); i++) {
            System.out.println("Пользователь " + listOfUsers.get(i));
        }
    }

    public void findUser(String username) {
        for (String listOfUsers : listOfUsers) {
            if (listOfUsers.contains(username)) {
                System.out.println("Это " + username);
            } else System.out.println("Это не " + username);
        }
    }
}