import java.util.Scanner;

public class H025 {
    public static void main(String[] args) {
        String s, t;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Word :");
        s = scan.next();
        System.out.println("Enter the Second Word :");
        t = scan.next();
        int flag = check(s, t, 0, 0, 0);
        System.out.println(s + " " + t + " " + " is ------>" + oneAway(flag));
        scan.close();

    }

    private static boolean oneAway(int flag) {
        if (flag == 1)
            return true;

        return false;
    }

    private static int check(String s, String t, int i, int j, int flag) {
        if (i > s.length() - 1 || j > t.length()) {
            return flag;
        }
        if (s.length() - 1 != t.length() - 1) {
            return flag;
        }

        if (s.charAt(i) != t.charAt(j)) {
            flag += 1;

        }
        j++;
        i++;
        return check(s, t, i, j, flag);
    }
}