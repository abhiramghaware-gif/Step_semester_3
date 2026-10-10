class Customer {
    protected double billAmount;

    public Customer(double billAmount) {
        this.billAmount = billAmount;
    }

    public double calculateFinalAmount() {
        return 0.0;
    }
}

class Student extends Customer {
    public Student(double billAmount) {
        super(billAmount);
    }

    @Override
    public double calculateFinalAmount() {
        return billAmount * 0.90;
    }
}

class Staff extends Customer {
    public Staff(double billAmount) {
        super(billAmount);
    }

    @Override
    public double calculateFinalAmount() {
        return billAmount * 0.95;
    }
}

class Guest extends Customer {
    public Guest(double billAmount) {
        super(billAmount);
    }

    @Override
    public double calculateFinalAmount() {
        return billAmount + 10;
    }
}

public class P1_TheCanteenBillingCounter {
    public static void main(String[] args) {
        Customer[] customers = {
            new Student(200),
            new Staff(300),
            new Guest(150)
        };
        
        double total = 0;
        
        System.out.printf("STUDENT: %.2f\n", customers[0].calculateFinalAmount());
        System.out.printf("STAFF: %.2f\n", customers[1].calculateFinalAmount());
        System.out.printf("GUEST: %.2f\n", customers[2].calculateFinalAmount());
        
        for (Customer c : customers) {
            total += c.calculateFinalAmount();
        }
        
        System.out.printf("Total: %.2f\n", total);
    }
}
