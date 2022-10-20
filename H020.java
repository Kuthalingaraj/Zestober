import java.util.Scanner;

public class H020 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        str = scan.next();

        int index = helperfunction(str);
        boolean result = consecutiveString(str, index);
        System.out.println(str + "  is -->  " + result);
        scan.close();
    }

    private static int helperfunction(String str) {
        int firstIndex = 0;
        return firstIndex;
    }

    private static boolean consecutiveString(String str, int firstIndex) {
        char c[] = str.toCharArray();

        if ((c == null) || (c.length == 1) || (c.length == 0) || (firstIndex == c.length - 1))
            return false;

        if (c[firstIndex] == c[firstIndex + 1])
            return true;
        firstIndex++;
        return consecutiveString(str, firstIndex);
    }

}
