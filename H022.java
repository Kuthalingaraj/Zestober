import java.util.Scanner;

public class H022 {
    public static void main(String[] args) {
        String s, t;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First String :");
        s = scan.next();
        System.out.println("Enter the Second String :");
        t = scan.next();
        System.out.println(firstDiff(s, t, 0, 0));
        scan.close();
    }

    private static int firstDiff(String s, String t, int i, int j) {
        // basecondition
        if (i > s.length() - 1 && j > t.length() - 1)
            return -1;
        // check the condition "abc" "abcdef"
        if (j > s.length() - 1)
            return j;

        // check the conditon "abcdefghij" "ab"
        if (i > t.length() - 1)
            return i;
        // check all same length "abc" "abd"
        if (s.charAt(i) != t.charAt(j))
            return i;
        i++;
        j++;

        return firstDiff(s, t, i, j);
    }
}