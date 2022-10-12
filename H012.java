import java.util.Scanner;

public class H012 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Word :");
        str = scan.nextLine();
        boolean result = palindrome(str);
        if (result == true) {
            System.out.println(str + "-->" + result);
        } else {
            System.out.println(str + "-->" + result);
        }
        scan.close();
    }

    private static boolean palindrome(String str) {
        char[] word = str.toCharArray();
        int start = 0;
        int end = word.length - 1;
        while (end > start) {
            if (word[start] != word[end]) {
                return false;
            }
            ++start;
            --end;
        }
        return true;
    }
}
