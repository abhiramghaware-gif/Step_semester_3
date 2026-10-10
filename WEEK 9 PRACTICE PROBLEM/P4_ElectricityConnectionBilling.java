abstract class Connection {
    protected double units;

    public Connection(double units) {
        this.units = units;
    }

    public abstract double calculateBill();
}

class HomeConnection extends Connection {
    public HomeConnection(double units) {
        super(units);
    }

    @Override
    public double calculateBill() {
        if (units <= 100) {
            return units * 5;
        } else {
            return (100 * 5) + ((units - 100) * 7);
        }
    }
}

class ShopConnection extends Connection {
    public ShopConnection(double units) {
        super(units);
    }

    @Override
    public double calculateBill() {
        return (units * 8) + 100;
    }
}

class FactoryConnection extends Connection {
    public FactoryConnection(double units) {
        super(units);
    }

    @Override
    public double calculateBill() {
        return Math.max(1000.0, units * 6);
    }
}

public class P4_ElectricityConnectionBilling {
    public static void main(String[] args) {
        Connection[] connections = {
            new HomeConnection(150),
            new ShopConnection(90),
            new FactoryConnection(120)
        };
        
        double total = 0;
        
        System.out.printf("HOME: %.2f\n", connections[0].calculateBill());
        System.out.printf("SHOP: %.2f\n", connections[1].calculateBill());
        System.out.printf("FACTORY: %.2f\n", connections[2].calculateBill());
        
        for (Connection c : connections) {
            total += c.calculateBill();
        }
        
        System.out.printf("Total: %.2f\n", total);
    }
}
