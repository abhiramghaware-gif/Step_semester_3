abstract class Booking {
    protected double distanceKm;
    protected static final double BOOKING_FEE = 50.0;

    public Booking(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    protected abstract double calculateBaseFare();

    public double calculateTotalFare() {
        return calculateBaseFare() + BOOKING_FEE;
    }
}

class BusBooking extends Booking {
    public BusBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    protected double calculateBaseFare() {
        return 2.0 * distanceKm;
    }
}

class TrainBooking extends Booking {
    public TrainBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    protected double calculateBaseFare() {
        return 1.5 * distanceKm;
    }
}

class FlightBooking extends Booking {
    public FlightBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    protected double calculateBaseFare() {
        return 2500.0 + (4.0 * distanceKm);
    }
}

public class P5_TravelBookingWithCommonFee {
    public static void main(String[] args) {
        Booking[] bookings = {
            new BusBooking(200),
            new TrainBooking(300),
            new FlightBooking(500)
        };
        
        System.out.printf("BUS: %.2f\n", bookings[0].calculateTotalFare());
        System.out.printf("TRAIN: %.2f\n", bookings[1].calculateTotalFare());
        System.out.printf("FLIGHT: %.2f\n", bookings[2].calculateTotalFare());
    }
}
