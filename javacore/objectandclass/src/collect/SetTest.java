package collect;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        HashSet words = new HashSet<String>();
        long totalTime = 0;

        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNextInt()) {
                String word = in.next();
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
            in.close();
        }


        Iterator<String> iter = words.iterator();
        for (int i = 0; i < 20 && iter.hasNext(); i++) {
            System.out.println(iter.next());
        }
        System.out.println("……");
        System.out.println(words.size() + "distinct words." + totalTime + "milliseconds");
    }
}
