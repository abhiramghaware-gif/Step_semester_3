class Vehicle {
    protected int hours;

    public Vehicle(int hours) {
        this.hours = hours;
    }

    public double calculateCharge() {
        return 0.0;
    }
}

class Bike extends Vehicle {
    public Bike(int hours) {
        super(hours);
    }

    @Override
    public double calculateCharge() {
        return 10 * hours;
    }
}

class Car extends Vehicle {
    public Car(int hours) {
        super(hours);
    }

    @Override
    public double calculateCharge() {
        if (hours <= 0) return 0;
        return 30 + (hours - 1) * 20;
    }
}

class Truck extends Vehicle {
    public Truck(int hours) {
        super(hours);
    }

    @Override
    public double calculateCharge() {
        return Math.max(100.0, 50.0 * hours);
    }
}

public class P2_TheCampusParkingChargeCalculator {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Bike(3),
            new Car(4),
            new Truck(1),
            new Car(1)
        };
        
        double total = 0;
        
        System.out.printf("BIKE: %.2f\n", vehicles[0].calculateCharge());
        System.out.printf("CAR: %.2f\n", vehicles[1].calculateCharge());
        System.out.printf("TRUCK: %.2f\n", vehicles[2].calculateCharge());
        System.out.printf("CAR: %.2f\n", vehicles[3].calculateCharge());
        
        for (Vehicle v : vehicles) {
            total += v.calculateCharge();
        }
        
        System.out.printf("Total: %.2f\n", total);
    }
}
