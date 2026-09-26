package main.java.hw7week;

class PasswordChecker {

    private final String password;

    public PasswordChecker(String password) {
        this.password = password;
    }

    public String getStrength() {

        int len = password.length();

        if (len < 6)
            return "Weak";
        else if (len <= 9)
            return "Medium";
        else
            return "Strong";
    }
}

public class Problem3 {

    public static void main(String[] args) {

        PasswordChecker p1 =
                new PasswordChecker("abcd");

        PasswordChecker p2 =
                new PasswordChecker("abcdefghij");

        System.out.println(p1.getStrength());
        System.out.println(p2.getStrength());
    }
}