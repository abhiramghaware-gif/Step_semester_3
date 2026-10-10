class Cab {
    protected double distance;
    protected boolean isNight;

    public Cab(double distance, boolean isNight) {
        this.distance = distance;
        this.isNight = isNight;
    }

    public double calculateFare() {
        return 0.0;
    }
}

class Mini extends Cab {
    public Mini(double distance, boolean isNight) {
        super(distance, isNight);
    }

    @Override
    public double calculateFare() {
        if (isNight) {
            return -1; // Indicate rejected
        }
        double fare = Math.max(100, 10 * distance);
        return fare;
    }
}

class Sedan extends Cab {
    public Sedan(double distance, boolean isNight) {
        super(distance, isNight);
    }

    @Override
    public double calculateFare() {
        double fare = Math.max(100, 14 * distance);
        if (isNight) {
            fare *= 1.20;
        }
        return fare;
    }
}

class SUV extends Cab {
    public SUV(double distance, boolean isNight) {
        super(distance, isNight);
    }

    @Override
    public double calculateFare() {
        double fare = Math.max(100, 18 * distance);
        if (isNight) {
            fare *= 1.20;
        }
        return fare;
    }
}

public class P4_CityCabFareMeter {
    public static void main(String[] args) {
        Cab[] trips = {
            new Mini(8, false),
            new Sedan(10, true),
            new SUV(20, false),
            new Mini(5, true)
        };
        
        double total = 0;
        
        System.out.printf("MINI: %.2f\n", trips[0].calculateFare());
        System.out.printf("SEDAN: %.2f\n", trips[1].calculateFare());
        System.out.printf("SUV: %.2f\n", trips[2].calculateFare());
        System.out.println("MINI: night service not available");
        
        for (Cab c : trips) {
            double fare = c.calculateFare();
            if (fare != -1) {
                total += fare;
            }
        }
        
        System.out.printf("Total: %.2f\n", total);
    }
}
