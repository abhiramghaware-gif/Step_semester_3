class Parcel {
    protected double weight;
    protected double declaredValue;

    public Parcel(double weight, double declaredValue) {
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

    public double calculateCharge() {
        return 0.0;
    }

    public double calculateInsurance() {
        return 0.0;
    }

    public double calculateTotal() {
        return calculateCharge() + calculateInsurance();
    }
}

class StandardParcel extends Parcel {
    public StandardParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    @Override
    public double calculateCharge() {
        return 40 + (10 * weight);
    }
}

class ExpressParcel extends Parcel {
    public ExpressParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    @Override
    public double calculateCharge() {
        return 80 + (15 * weight);
    }

    @Override
    public double calculateInsurance() {
        return 0.02 * declaredValue;
    }
}

class FragileParcel extends Parcel {
    public FragileParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    @Override
    public double calculateCharge() {
        return 40 + (10 * weight) + 50;
    }

    @Override
    public double calculateInsurance() {
        return 0.02 * declaredValue;
    }
}

public class P2_ParcelShippingDesk {
    public static void main(String[] args) {
        Parcel[] parcels = {
            new StandardParcel(3, 500),
            new ExpressParcel(2, 1000),
            new FragileParcel(4, 2000)
        };
        
        double grandTotal = 0;
        
        System.out.printf("STANDARD: Charge=%.2f Insurance=%.2f Total=%.2f\n", 
            parcels[0].calculateCharge(), parcels[0].calculateInsurance(), parcels[0].calculateTotal());
        System.out.printf("EXPRESS: Charge=%.2f Insurance=%.2f Total=%.2f\n", 
            parcels[1].calculateCharge(), parcels[1].calculateInsurance(), parcels[1].calculateTotal());
        System.out.printf("FRAGILE: Charge=%.2f Insurance=%.2f Total=%.2f\n", 
            parcels[2].calculateCharge(), parcels[2].calculateInsurance(), parcels[2].calculateTotal());
            
        for (Parcel p : parcels) {
            grandTotal += p.calculateTotal();
        }
        
        System.out.printf("Grand Total: %.2f\n", grandTotal);
    }
}
