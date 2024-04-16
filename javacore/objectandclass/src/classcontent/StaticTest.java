package classcontent;

import java.time.LocalDate;

/**
 * 编写id函数
 */
public class StaticTest {
    /**
     * 入口函数
     */
    public static void main(String[] args) {
        EmployeeT[] staff = new EmployeeT[3];
        staff[0] = new EmployeeT("carl", 75000);
        staff[1] = new EmployeeT("Hacker", 50000);
        staff[2] = new EmployeeT("Tony", 40000);

        for (EmployeeT e : staff)
        {
            e.setId();
            System.out.println("name:"+e.getName()+",id:"+e.getId()+",salary"+e.getSalary());
        }
        int n = EmployeeT.getNextId();
        System.out.println("Next available id = " + n);

    }
}

/**
 * 为职员生成id的函数
 */

class EmployeeT {
    private static int nextId = 1;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    private double salary;
    private String name;
    private int id;

    public EmployeeT(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        var e = new EmployeeT("herry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }


}
