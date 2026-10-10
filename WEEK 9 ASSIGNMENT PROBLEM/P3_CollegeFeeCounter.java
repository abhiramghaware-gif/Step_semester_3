class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public double calculateFee() {
        return 0.0;
    }

    public String getName() {
        return name;
    }
}

class DayScholar extends Student {
    public DayScholar(String name) {
        super(name);
    }

    @Override
    public double calculateFee() {
        return 40000 + 12000;
    }
}

class Hosteller extends Student {
    public Hosteller(String name) {
        super(name);
    }

    @Override
    public double calculateFee() {
        return 40000 + 60000;
    }
}

class Scholar extends Student {
    public Scholar(String name) {
        super(name);
    }

    @Override
    public double calculateFee() {
        return 20000 + 12000;
    }
}

public class P3_CollegeFeeCounter {
    public static void main(String[] args) {
        Student[] students = {
            new DayScholar("Asha"),
            new Hosteller("Ravi"),
            new Scholar("Neha")
        };
        
        double totalCollected = 0;
        
        for (Student s : students) {
            System.out.printf("%s: %.2f\n", s.getName(), s.calculateFee());
            totalCollected += s.calculateFee();
        }
        
        System.out.printf("Total Collected: %.2f\n", totalCollected);
    }
}
