import java.util.Scanner;

//To check all the special Characters also
//and if its in the string return false
//other wise return true;
public class H023 {
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Values :");
        s = scan.next();
        int flag = check(s, 0, 0);
        System.out.println(isBinary(flag, s));
        scan.close();
    }

    private static boolean isBinary(int flag, String s) {
        if (flag == s.length())
            return true;
        return false;
    }

    private static int check(String s, int i, int flag) {
        if (i > s.length() - 1)
            return flag;
        if (s.charAt(i) >= 48 && s.charAt(i) <= 49)
            flag += 1;
        i++;
        return check(s, i, flag);
    }
}