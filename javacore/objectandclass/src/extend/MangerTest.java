package extend;


public class MangerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Eployes[] staff = new Eployes[3];
        staff[0] = boss;
        staff[1] = new Eployes("hacker", 50000, 1988, 10, 1);
        staff[2] = new Eployes("tommy", 40000, 1990, 5, 13);

        for (Eployes e : staff) {
            System.out.println("name:" + e.getName() + ",salary:" + e.getSalary());
        }
    }
}

