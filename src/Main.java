import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Developer dev = new Developer("andrzej", "jarosz", "warszawska 22", "AJ@WP.PL", 123456789, 2020);
        Technology t = new Technology("Java", 150);
        employees.add(dev);
        dev.addTechnology(t);


        Tester tes = new Tester("andrzej", "jarosz", "warszawska 22", "AJ@WP.PL", 246643122, 2020);
        Testtype te = new Testtype("UI/UX", 200);
        employees.add(tes);
        tes.addTestTypes(te);


        Manager man = new Manager("andrzej", "jarosz", "warszawska 22", "AJ@WP.PL", 225454635, 2020);
        Goal g = new Goal(2022, 12, 13, "Implementing FB login", 1200);
        employees.add(man);
        man.addGoal(g);

        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();

            System.out.println("Total amount to be paid this month: "
                    + totalAmount + " USD");
        }
    }
}