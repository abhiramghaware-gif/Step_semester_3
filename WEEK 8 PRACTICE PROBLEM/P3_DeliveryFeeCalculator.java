class Delivery {
    protected double weight;
    protected double distance;

    public Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double calculateFee() {
        return 0;
    }
}

class StandardDelivery extends Delivery {
    public StandardDelivery(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double calculateFee() {
        return 5 + (0.50 * weight) + (0.10 * distance);
    }
}

class ExpressDelivery extends Delivery {
    public ExpressDelivery(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double calculateFee() {
        return 15 + (1.00 * weight) + (0.20 * distance);
    }
}

class InternationalDelivery extends Delivery {
    private double customsFee;

    public InternationalDelivery(double weight, double distance, double customsFee) {
        super(weight, distance);
        this.customsFee = customsFee;
    }

    @Override
    public double calculateFee() {
        return 25 + (2.00 * weight) + (0.50 * distance) + customsFee;
    }
}

public class P3_DeliveryFeeCalculator {
    public static void main(String[] args) {
        Delivery[] requests = {
            new StandardDelivery(10, 50),
            new ExpressDelivery(5, 20),
            new InternationalDelivery(20, 100, 30)
        };

        double grandTotal = 0;
        
        System.out.printf("STANDARD: %.2f\n", requests[0].calculateFee());
        System.out.printf("EXPRESS: %.2f\n", requests[1].calculateFee());
        System.out.printf("INTERNATIONAL: %.2f\n", requests[2].calculateFee());
        
        for (Delivery req : requests) {
            grandTotal += req.calculateFee();
        }
        
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
