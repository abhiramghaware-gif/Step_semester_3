class Employee {
    protected String name;
    protected double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public double calculateBonus() {
        return 0.0;
    }

    public String getName() {
        return name;
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    public double calculateBonus() {
        return monthlySalary * 0.10;
    }
}

class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    public double calculateBonus() {
        return monthlySalary * 0.05;
    }
}

class InternEmployee extends Employee {
    public InternEmployee(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    @Override
    public double calculateBonus() {
        return 2000.0;
    }
}

public class P4_TheFestivalBonusCalculator {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Asha", 50000),
            new PartTimeEmployee("Ravi", 30000),
            new InternEmployee("Neha", 15000)
        };
        
        double totalBonus = 0;
        
        for (Employee e : employees) {
            System.out.printf("%s: %.2f\n", e.getName(), e.calculateBonus());
            totalBonus += e.calculateBonus();
        }
        
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }
}
