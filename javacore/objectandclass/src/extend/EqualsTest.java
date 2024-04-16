package extend;

import java.time.LocalDate;
import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("alice", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("alice", 75000, 1987, 12, 15);
        Employee bob = new Employee("bob", 50000, 1989, 10, 1);


        System.out.println("alice1==alice2:" + (alice1 == alice2));
//        引用的是同一个值so结果为true
        System.out.println("alice1==alice3:" + (alice1 == alice3));
//        不是同一个结果所以为false
        System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));
//        每一项都相同所以返回true
        System.out.println("alice1.equals(bob):" + alice1.equals(bob));
//        有不同所以false

        Manger carl = new Manger("carl", 8000, 1987, 12, 15);
        Manger boss = new Manger("carl", 8000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString():" + boss);
        System.out.println("carl.equals(boss):" + carl.equals(boss));
//        不加boss的话这个值就是true了
        System.out.println("alice1.hashCode():" + alice1.hashCode());
        System.out.println("alice3.hashCode():" + alice3.hashCode());
//        以上的hashcode是完全相同的-因为内容相同
        System.out.println("bob.hashCode():" + bob.hashCode());
        System.out.println("carl.hashCode():" + carl.hashCode());
//        他们的hash完全不一样，和上面的也不一样

    }
}


