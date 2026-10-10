abstract class Staff {
    protected String name;

    public Staff(String name) {
        this.name = name;
    }

    public abstract double calculatePay();

    public String getName() {
        return name;
    }
}

class FullTimeStaff extends Staff {
    private double weeklySalary;

    public FullTimeStaff(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double calculatePay() {
        return weeklySalary;
    }
}

class HourlyStaff extends Staff {
    private double hours;
    private double rate;

    public HourlyStaff(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePay() {
        if (hours <= 40) {
            return hours * rate;
        } else {
            return (40 * rate) + ((hours - 40) * 1.5 * rate);
        }
    }
}

class Intern extends Staff {
    private double stipend;

    public Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    @Override
    public double calculatePay() {
        return stipend;
    }
}

public class P2_WeeklyStaffPay {
    public static void main(String[] args) {
        Staff[] employees = {
            new FullTimeStaff("Asha", 12000),
            new HourlyStaff("Ravi", 45, 200),
            new Intern("Neha", 5000)
        };
        
        double totalPayroll = 0;
        
        for (Staff s : employees) {
            System.out.printf("%s: %.2f\n", s.getName(), s.calculatePay());
            totalPayroll += s.calculatePay();
        }
        
        System.out.printf("Total Payroll: %.2f\n", totalPayroll);
    }
}
