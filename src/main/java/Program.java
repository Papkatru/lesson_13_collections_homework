public class Program {

    public static void main(String[] args) {

        //Как работает List
        Users users = new Users();
        users.addNewUser("Adella Lockman");
        users.addNewUser("Mack O'Connell");
        users.addNewUser("Ellis Pouros");
        users.addNewUser("Jamar Champlin");
        users.deleteUser("Mack O'Connell");
        users.showAllUsers();
        users.findUser("Adella Lockman");


        //Как работает Map
        Accounts accounts = new Accounts();
        accounts.addNewAccount(389, "dc04$@lab2012");
        accounts.addNewAccount(636, "dc09$@lab150000.local");
        accounts.addNewAccount(417, "unset@docker");
        accounts.addNewAccount(986, "srvtest01$@13");
        accounts.deleteAccount("dc09$@lab150000.local");
        accounts.showAllAccounts();

        //Как работает Set
        Hosts hosts = new Hosts();
        hosts.addNewHost("fortisiem01.rvlab.local");
        hosts.addNewHost("win8x64en02.lab2012.local");
        hosts.addNewHost("ksc12n.rvlab.local");
        hosts.addNewHost("sysaid01");
        hosts.deleteHost("sysaid01");
        hosts.showAllHosts();
        hosts.findHost("win8x64en02.lab2012.local");
    }
}
