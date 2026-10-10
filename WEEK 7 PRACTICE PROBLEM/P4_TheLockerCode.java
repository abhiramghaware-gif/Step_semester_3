public class P4_TheLockerCode {

    private final int lockerNumber;
    private String combinationCode;

    public P4_TheLockerCode(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combinationCode = initialCode;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (combinationCode.equals(currentCode)) {
            combinationCode = newCode;
            System.out.println("Code changed successfully for locker " + lockerNumber);
            return true;
        } else {
            System.out.println("Rejected: wrong current code for locker " + lockerNumber);
            return false;
        }
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {
        P4_TheLockerCode locker = new P4_TheLockerCode(101, "1234");
        locker.changeCode("1234", "5678");
        locker.changeCode("0000", "9999");
    }
}
