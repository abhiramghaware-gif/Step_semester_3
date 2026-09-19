class Student {
    String name;
    int attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class M5_StudentAndCollegeInformationManagement {
    public static void main(String[] args) {
        new Student("Alice", 85);
        new Student("Bob", 90);
        
        Student.printCollegeInfo();
    }
}
