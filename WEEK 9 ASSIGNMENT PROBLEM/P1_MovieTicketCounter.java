class TicketBooking {
    protected int count;
    protected double convenienceFee = 20;

    public TicketBooking(int count) {
        this.count = count;
    }

    public double calculateAmount() {
        return 0.0;
    }
}

class RegularBooking extends TicketBooking {
    public RegularBooking(int count) {
        super(count);
    }

    @Override
    public double calculateAmount() {
        return (150 * count) + (convenienceFee * count);
    }
}

class PremiumBooking extends TicketBooking {
    public PremiumBooking(int count) {
        super(count);
    }

    @Override
    public double calculateAmount() {
        return (250 * count) + (convenienceFee * count);
    }
}

class ReclinerBooking extends TicketBooking {
    public ReclinerBooking(int count) {
        super(count);
    }

    @Override
    public double calculateAmount() {
        return (400 * count) + (convenienceFee * count);
    }
}

public class P1_MovieTicketCounter {
    public static void main(String[] args) {
        TicketBooking[] bookings = {
            new RegularBooking(3),
            new PremiumBooking(2),
            new ReclinerBooking(1)
        };
        
        double total = 0;
        
        System.out.printf("REGULAR: %.2f\n", bookings[0].calculateAmount());
        System.out.printf("PREMIUM: %.2f\n", bookings[1].calculateAmount());
        System.out.printf("RECLINER: %.2f\n", bookings[2].calculateAmount());
        
        for (TicketBooking b : bookings) {
            total += b.calculateAmount();
        }
        
        System.out.printf("Total: %.2f\n", total);
    }
}
