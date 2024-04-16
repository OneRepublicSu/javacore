package extend;

import java.time.*;
public class Eployes {

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

    public Eployes(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    public void raiseSalary(double byPercennt){
        double raise = salary * byPercennt/100;
        salary += raise;
    }

}
