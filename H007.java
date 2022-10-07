import java.util.Scanner;

public class H007 {
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Year :");
        year = scan.nextInt();
        boolean result = leapYear(year);
        System.out.println(year + " --> " + result);
        scan.close();
    }

    private static boolean leapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else {
            return false;
        }

    }
}