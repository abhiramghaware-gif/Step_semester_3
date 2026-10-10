import java.time.LocalDate;

class LibraryItem {
    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public int getBorrowingPeriod() {
        return 0;
    }

    public LocalDate calculateDueDate(LocalDate currentDate) {
        return currentDate.plusDays(getBorrowingPeriod());
    }

    public String getTitle() {
        return title;
    }
}

class Book extends LibraryItem {
    public Book(String title) {
        super(title);
    }

    @Override
    public int getBorrowingPeriod() {
        return 14;
    }
}

class DVD extends LibraryItem {
    public DVD(String title) {
        super(title);
    }

    @Override
    public int getBorrowingPeriod() {
        return 7;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title) {
        super(title);
    }

    @Override
    public int getBorrowingPeriod() {
        return 3;
    }
}

public class P2_LibraryItemDueDateCalculator {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2023, 10, 26);
        
        LibraryItem[] items = {
            new Book("1984"),
            new DVD("The Matrix"),
            new Magazine("Forbes Issue 500")
        };
        
        for (LibraryItem item : items) {
            System.out.println(item.getTitle() + ": " + item.calculateDueDate(currentDate));
        }
    }
}
