import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class H009 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Name:");
        str = scan.nextLine();
        nameCounter(str);
        scan.close();
    }

    private static void nameCounter(String str) {
        str = str.toLowerCase();
        char[] c = str.toCharArray();
        int sum = 0;
        // I store a character and the value using datastructure concept in Map
        // Interface:
        Map<Character, Integer> name = new HashMap<Character, Integer>();
        int value = 1;
        for (char i = 'a'; i <= 'z'; i++, value++) {
            name.put(i, value);
        }
        // Storing map Like a=1,b=2,,,,,z=26. using loops
        System.out.println(name);
        // Then the character is in the map true or false to identify containsKey method
        for (char i = 0; i < c.length; i++) {
            if (name.containsKey(c[i])) {
                sum += name.get(c[i]);
            }
        }
        System.out.println(str + "-->" + sum);

    }
}