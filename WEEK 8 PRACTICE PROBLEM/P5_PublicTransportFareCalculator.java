class Transport {
    protected double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public double calculateFare() {
        return 0.0;
    }
}

class Bus extends Transport {
    public Bus(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        double fare = 2.0 + (0.10 * distance);
        return Math.min(fare, 10.0);
    }
}

class Train extends Transport {
    public Train(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return 3.0 + (0.15 * distance);
    }
}

class Metro extends Transport {
    private double peakHourFactor;

    public Metro(double distance, double peakHourFactor) {
        super(distance);
        this.peakHourFactor = peakHourFactor;
    }

    @Override
    public double calculateFare() {
        return (1.50 + (0.20 * distance)) * peakHourFactor;
    }
}

public class P5_PublicTransportFareCalculator {
    public static void main(String[] args) {
        Transport[] journeys = {
            new Bus(15),
            new Train(50),
            new Metro(10, 1.5)
        };
        
        double grandTotal = 0;
        
        System.out.printf("BUS: %.2f\n", journeys[0].calculateFare());
        System.out.printf("TRAIN: %.2f\n", journeys[1].calculateFare());
        System.out.printf("METRO: %.2f\n", journeys[2].calculateFare());
        
        for (Transport t : journeys) {
            grandTotal += t.calculateFare();
        }
        
        System.out.printf("Total: %.2f\n", grandTotal);
    }
}
