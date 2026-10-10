public class P1_ThePiggyBank {

    private double savings;
    private final String id;

    public P1_ThePiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
            System.out.println("Deposited: " + amount + " -> savings = " + savings);
        }
    }

    public void withdraw(double amount) {
        if (amount > savings) {
            System.out.println("Withdrawal of " + amount + " rejected, savings stays " + savings);
        } else {
            savings -= amount;
            System.out.println("Withdrew: " + amount + " -> savings = " + savings);
        }
    }

    public double getSavings() {
        return savings;
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {
        P1_ThePiggyBank pb = new P1_ThePiggyBank("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
    }
}
