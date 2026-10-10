class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double calculateFee() {
        return 0.0;
    }

    public double getFinalAmount() {
        return amount + calculateFee();
    }
}

class CardPayment extends Payment {
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return amount * 0.02;
    }
}

class WalletPayment extends Payment {
    public WalletPayment(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return amount * 0.01;
    }
}

class BankTransferPayment extends Payment {
    public BankTransferPayment(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return 0.0;
    }
}

public class P1_PaymentSystemFeeCalculation {
    public static void main(String[] args) {
        Payment[] transactions = {
            new CardPayment(1000),
            new WalletPayment(500),
            new BankTransferPayment(2000)
        };

        double grandTotal = 0;
        
        System.out.printf("CARD: %.2f\n", transactions[0].getFinalAmount());
        System.out.printf("WALLET: %.2f\n", transactions[1].getFinalAmount());
        System.out.printf("BANKTRANSFER: %.2f\n", transactions[2].getFinalAmount());
        
        for (Payment p : transactions) {
            grandTotal += p.getFinalAmount();
        }
        
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
