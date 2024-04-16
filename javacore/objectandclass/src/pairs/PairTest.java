package pairs;

import java.time.LocalDate;
import java.util.Objects;

public class PairTest {
    public static void main(String[] args) {
        LocalDate[] birthday = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1815, 12, 10),
                LocalDate.of(1903, 12, 3),
                LocalDate.of(1910, 6, 22),
        };
        Pairs<LocalDate> mm = Arraylgs.minmax(birthday);
        System.out.println("min:"+mm.getFirst());
        System.out.println("min:"+mm.getSecond());
    }
}

class Arraylgs {
    //    取代void的尖括号就是泛型
//    函数名Pair之后的尖括号也是限制类型的泛型
    public static <T extends Comparable> Pairs<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pairs<>(min, max);

    }
}

class Pairs<T> {
    private T first;
    private T second;

    public Pairs(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(first, ((Pairs<?>) o).getFirst()) && Objects.equals(second, ((Pairs<?>) o).getSecond());
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "Pairs{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

}
