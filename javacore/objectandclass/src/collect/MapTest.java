package collect;

import implement.EmployeeI;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap staff = new HashMap<String, Employee>();
        staff.put("144-25-5464", new Employee("Amy"));
        staff.put("567-25-8784", new Employee("harry"));
        staff.put("567-67-8562", new Employee("gary"));

        System.out.println("^^^");
        staff.forEach((k, v) -> {
            System.out.println("key:" + k + "value:" + v);
        });

        System.out.println("^^^");
        staff.remove("567-25-8784");
        staff.forEach((k, v) -> {
            System.out.println("key:" + k + "value:" + v);
        });

        System.out.println("^^^");
        staff.put("567-28-8784",new Employee("miller"));
        staff.forEach((k, v) -> {
            System.out.println("key:" + k + "value:" + v);
        });

    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ']';
    }
}
