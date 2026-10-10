class Room {
    protected int units;

    public Room(int units) {
        this.units = units;
    }

    public double calculateBill() {
        return 0.0;
    }
}

class SingleRoom extends Room {
    public SingleRoom(int units) {
        super(units);
    }

    @Override
    public double calculateBill() {
        return 8 * units;
    }
}

class SharedRoom extends Room {
    private int occupants;

    public SharedRoom(int units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    @Override
    public double calculateBill() {
        return (6.0 * units) / occupants;
    }
}

class ACRoom extends Room {
    public ACRoom(int units) {
        super(units);
    }

    @Override
    public double calculateBill() {
        return (10 * units) + 200;
    }
}

public class P3_TheHostelElectricityBill {
    public static void main(String[] args) {
        Room[] rooms = {
            new SingleRoom(120),
            new SharedRoom(150, 3),
            new ACRoom(100)
        };
        
        double total = 0;
        
        System.out.printf("SINGLE: %.2f\n", rooms[0].calculateBill());
        System.out.printf("SHARED: %.2f\n", rooms[1].calculateBill());
        System.out.printf("AC: %.2f\n", rooms[2].calculateBill());
        
        for (Room r : rooms) {
            total += r.calculateBill();
        }
        
        System.out.printf("Total: %.2f\n", total);
    }
}
