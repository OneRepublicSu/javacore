package implement;

import java.util.*;

public class EmployeeSortTest {
    public static void main(String[] args) {
        EmployeeI[] staff = new EmployeeI[3];
        staff[0] = new EmployeeI("harry", 35000);
        staff[1] = new EmployeeI("carl", 75000);
        staff[2] = new EmployeeI("tony", 38000);

        Arrays.sort(staff);

        for (EmployeeI e : staff) {
            System.out.println("name:" + e.getName() + ",salary" + e.getSalary());
        }

    }
}

