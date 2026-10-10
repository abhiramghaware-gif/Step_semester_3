import java.time.LocalDate;

class SubscriptionPlan {
    protected String name;
    protected LocalDate startDate;

    public SubscriptionPlan(String name, String startDateStr) {
        this.name = name;
        this.startDate = LocalDate.parse(startDateStr);
    }

    public LocalDate calculateRenewalDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }
}

class BasicPlan extends SubscriptionPlan {
    public BasicPlan(String name, String startDateStr) {
        super(name, startDateStr);
    }

    @Override
    public LocalDate calculateRenewalDate() {
        return startDate.plusDays(30);
    }
}

class StandardPlan extends SubscriptionPlan {
    public StandardPlan(String name, String startDateStr) {
        super(name, startDateStr);
    }

    @Override
    public LocalDate calculateRenewalDate() {
        return startDate.plusDays(90);
    }
}

class PremiumPlan extends SubscriptionPlan {
    public PremiumPlan(String name, String startDateStr) {
        super(name, startDateStr);
    }

    @Override
    public LocalDate calculateRenewalDate() {
        return startDate.plusDays(365);
    }
}

public class P5_TheStreamingPlanRenewalReminder {
    public static void main(String[] args) {
        SubscriptionPlan[] plans = {
            new BasicPlan("Asha", "2024-01-15"),
            new StandardPlan("Ravi", "2024-02-01"),
            new PremiumPlan("Neha", "2024-03-10"),
            new BasicPlan("Kiran", "2024-12-20")
        };
        
        for (SubscriptionPlan plan : plans) {
            System.out.println(plan.getName() + ": " + plan.calculateRenewalDate());
        }
    }
}
