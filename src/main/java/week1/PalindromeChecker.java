import java.util.*;

public class PalindromeChecker {

    static boolean isPalindromeIterative(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String s, int l, int r) {
        if (l >= r)
            return true;

        if (s.charAt(l) != s.charAt(r))
            return false;

        return isPalindromeRecursive(s, l + 1, r - 1);
    }

    static boolean isPalindromeArrayReversal(String s) {
        char[] arr = s.toCharArray();

        String rev = "";
        for (int i = arr.length - 1; i >= 0; i--)
            rev += arr[i];

        return s.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Iterative: " +
                isPalindromeIterative(text));

        System.out.println("Recursive: " +
                isPalindromeRecursive(text, 0, text.length() - 1));

        System.out.println("Array Reversal: " +
                isPalindromeArrayReversal(text));
    }
}
