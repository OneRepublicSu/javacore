package collect;
import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Item> parts = new TreeSet<>();
        parts.add(new Item("toaster",1234));
        parts.add(new Item("widget",4562));
        parts.add(new Item("modem",9912));
        System.out.println(parts);

        TreeSet sortByDescription =new TreeSet<Item>(Comparator.comparing(Item::getPartNumber));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}

