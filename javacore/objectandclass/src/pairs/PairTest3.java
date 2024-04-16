package pairs;

import java.time.LocalDate;
import java.util.Objects;

public class PairTest3 {
    public  static void main(String[] args) {
        Manager ceo = new Manager("greedy", 800000, 2003, 12, 15);
        Manager cfo = new Manager("sneaky", 600000, 2003, 12, 15);
        Pair buddies = new Pair<Manager>(ceo, cfo);
        printBuddies(buddies);

        ceo.setBonus(100000);
        cfo.setBonus(50000);

        Manager[] mangers = {ceo, cfo};
        var result = new Pair<Employee>();
        minmaxBonus(mangers, result);

        System.out.println("first:" + result.getFirst().getName() + "second:" + result.getSecond().getName());

        maxminBonus(mangers, result);
        System.out.println("first:" + result.getFirst().getName() + "second:" + result.getSecond().getName());

    }
    public static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second = p.getSecond();
        System.out.println(first.getName() + "and" + second.getName());

    }
    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.getBonus() > a[i].getBonus()) min = a[i];
            if (max.getBonus() < a[i].getBonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }


    public static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
        minmaxBonus(a, result);
        PairAlg.swapHelper(result);
    }


}


class PairAlg {
    public static boolean hasNulls(Pair<?> p) {
        return p.getFirst() == null || p.getSecond() == null;
    }

    public static void swap(Pair<?> p) {
        swapHelper(p);
    }

    public static <T> void swapHelper(Pair<T> p) {
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}


class Pair<T> {


    private T first;
    private T second;

    public Pair() {

    }


    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public Pair(T first, T second) {
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

class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {

        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }


    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}

class Employee {

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public void raiseSalary(double byPercennt) {
        double raise = salary * byPercennt / 100;
        salary += raise;
    }


}



