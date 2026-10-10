abstract class LibraryItem {
    protected String title;
    protected int daysLate;

    public LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    public abstract double calculateFine();

    public String getTitle() {
        return title;
    }
}

class Book extends LibraryItem {
    public Book(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double calculateFine() {
        return 2.0 * daysLate;
    }
}

class DVD extends LibraryItem {
    public DVD(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double calculateFine() {
        return Math.min(50.0, 5.0 * daysLate);
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title, int daysLate) {
        super(title, daysLate);
    }

    @Override
    public double calculateFine() {
        return 1.0 * daysLate;
    }
}

public class P3_LibraryLateFineCounter {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book("Algebra", 4),
            new DVD("Inception", 12),
            new Magazine("Sports", 3)
        };
        
        double totalFines = 0;
        
        for (LibraryItem item : items) {
            System.out.printf("%s: %.2f\n", item.getTitle(), item.calculateFine());
            totalFines += item.calculateFine();
        }
        
        System.out.printf("Total Fines: %.2f\n", totalFines);
    }
}
