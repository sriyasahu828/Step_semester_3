package main.java.week7;

class Locker {

    private String code;
    private final int lockerNumber;

    public Locker(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    public void changeCode(String oldCode, String newCode) {

        if (code.equals(oldCode)) {
            code = newCode;
            System.out.println("Code Changed");
        } else {
            System.out.println("Wrong Current Code");
        }
    }

    public int getLockerNumber() {
        return lockerNumber;
    }
}

public class Problem4 {

    public static void main(String[] args) {

        Locker l = new Locker(101, "1234");

        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}