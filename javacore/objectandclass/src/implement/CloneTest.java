package implement;

import java.util.Date;
import java.util.GregorianCalendar;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("john", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.setHireDay(2002, 12, 31);
        System.out.println("original:" + original.getName() + original.getSalary() + original.getHireDay());
        System.out.println("copy:" + copy.getName() + copy.getSalary() + copy.getHireDay());
    }

}

class Employee implements Cloneable {
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

}
