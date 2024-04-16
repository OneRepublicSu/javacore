package collect;
import java.util.*;
import java.time.*;

public class PqTest {
    public static void main(String[] args) {
        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1995,5,22));
        pq.add(LocalDate.of(1991,12,04));
        pq.add(LocalDate.of(1997,9,23));

        System.out.println("----------");
        for (LocalDate date:pq) {
            System.out.println(date);
        }
//        while (!pq.isEmpty()){
//            System.out.println( pq.remove());
//        }
    }
}
