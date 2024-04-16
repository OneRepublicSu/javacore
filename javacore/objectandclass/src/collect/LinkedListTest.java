package collect;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList a = new LinkedList<String>();
        a.add("amy");
        a.add("carl");
        a.add("erica");

        LinkedList b = new LinkedList<String>();

        b.add("bob");
        b.add("doug");
        b.add("frances");
        b.add("gloria");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while(bIter.hasNext()){
            if(aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println("第一次操作的结果：");
        System.out.println(a);
        System.out.println(b);

        bIter = b.iterator();
        while (bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);

    }
}
