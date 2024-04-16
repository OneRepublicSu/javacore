package implement;

public class EmployeeI implements Comparable<EmployeeI> {
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private String name;
    private double salary;

    public EmployeeI(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }


    @Override
    public int compareTo(EmployeeI other) {
        return Double.compare(salary,other.salary);
    }
}
