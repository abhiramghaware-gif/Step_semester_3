class Appliance {
    protected double hours;
    protected boolean saverMode;

    public Appliance(double hours, boolean saverMode) {
        this.hours = hours;
        this.saverMode = saverMode;
    }

    public double calculateUnits() {
        return 0.0;
    }

    public boolean supportsSaverMode() {
        return false;
    }

    public double calculateCost() {
        return calculateUnits() * 8;
    }
}

class Fridge extends Appliance {
    public Fridge(double hours) {
        super(hours, false);
    }

    @Override
    public double calculateUnits() {
        return (150 * hours) / 1000.0;
    }
}

class AC extends Appliance {
    public AC(double hours, boolean saverMode) {
        super(hours, saverMode);
    }

    @Override
    public boolean supportsSaverMode() {
        return true;
    }

    @Override
    public double calculateUnits() {
        double units = (1500 * hours) / 1000.0;
        if (saverMode) {
            units *= 0.75;
        }
        return units;
    }
}

class TV extends Appliance {
    public TV(double hours) {
        super(hours, false);
    }

    @Override
    public double calculateUnits() {
        return (100 * hours) / 1000.0;
    }
}

class Washer extends Appliance {
    public Washer(double hours, boolean saverMode) {
        super(hours, saverMode);
    }

    @Override
    public boolean supportsSaverMode() {
        return true;
    }

    @Override
    public double calculateUnits() {
        double units = (500 * hours) / 1000.0;
        if (saverMode) {
            units *= 0.75;
        }
        return units;
    }
}

public class P5_HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Appliance[] appliances = {
            new Fridge(24),
            new AC(8, true),
            new TV(5),
            new Washer(2, true)
        };
        
        double totalCost = 0;
        
        System.out.printf("FRIDGE: Units=%.2f Cost=%.2f\n", appliances[0].calculateUnits(), appliances[0].calculateCost());
        System.out.printf("AC: Units=%.2f Cost=%.2f\n", appliances[1].calculateUnits(), appliances[1].calculateCost());
        System.out.printf("TV: Units=%.2f Cost=%.2f\n", appliances[2].calculateUnits(), appliances[2].calculateCost());
        System.out.printf("WASHER: Units=%.2f Cost=%.2f\n", appliances[3].calculateUnits(), appliances[3].calculateCost());
        
        for (Appliance a : appliances) {
            totalCost += a.calculateCost();
        }
        
        System.out.printf("Total Cost: %.2f\n", totalCost);
    }
}
