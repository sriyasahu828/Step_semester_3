package main.java.week7;

class AttendanceSheet {

    private String[] students;
    private int count;

    public AttendanceSheet(int size) {
        students = new String[size];
        count = 0;
    }

    public void markPresent(String name) {

        if (isPresent(name))
            return;

        students[count] = name;
        count++;
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {

        for (int i = 0; i < count; i++) {

            if (students[i].equals(name))
                return true;
        }

        return false;
    }
}

public class Problem5 {

    public static void main(String[] args) {

        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Count = " + sheet.getPresentCount());

        System.out.println("Ben Present? " +
                sheet.isPresent("Ben"));

        System.out.println("Chen Present? " +
                sheet.isPresent("Chen"));
    }
}