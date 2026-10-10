abstract class Plot {
    protected String owner;

    public Plot(String owner) {
        this.owner = owner;
    }

    public abstract double calculateArea();

    public String getOwner() {
        return owner;
    }
}

class Circle extends Plot {
    private double radius;

    public Circle(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Plot {
    private double length;
    private double width;

    public Rectangle(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Triangle extends Plot {
    private double base;
    private double height;

    public Triangle(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class P1_GardenPlotAreaReport {
    public static void main(String[] args) {
        Plot[] plots = {
            new Circle("Asha", 5),
            new Rectangle("Ravi", 4, 6),
            new Triangle("Neha", 10, 3)
        };
        
        double totalArea = 0;
        
        System.out.printf("%s (CIRCLE): %.2f\n", plots[0].getOwner(), plots[0].calculateArea());
        System.out.printf("%s (RECTANGLE): %.2f\n", plots[1].getOwner(), plots[1].calculateArea());
        System.out.printf("%s (TRIANGLE): %.2f\n", plots[2].getOwner(), plots[2].calculateArea());
        
        for (Plot p : plots) {
            totalArea += p.calculateArea();
        }
        
        System.out.printf("Total Area: %.2f\n", totalArea);
    }
}
