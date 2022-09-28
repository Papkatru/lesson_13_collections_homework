import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hosts {

    Set<String> setOfHosts = new HashSet<>();

    public void addNewHost(String host) {
        setOfHosts.add(host);
    }

    public void deleteHost(String host) {
        setOfHosts.remove(host);
    }

    public void showAllHosts() {
        Iterator iterator = setOfHosts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void findHost(String host) {
        for (String setOfHosts : setOfHosts) {
            if (setOfHosts.contains(host)) {
                System.out.println("Это " + host);
            } else System.out.println("Это не " + host);
        }
    }
}
