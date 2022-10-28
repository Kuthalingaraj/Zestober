import java.util.ArrayList;
import java.util.Scanner;

public class H028 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Lists:");
        n = scan.nextInt();
        System.out.println("Enter the Numbers :");
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
        }
        System.out.println(list);

        System.out.println(containsNegativePair(list, 0, 0));

        scan.close();
    }

    private static boolean containsNegativePair(ArrayList<Integer> list, int index, int count) {

        // Base Condition...
        if (index > list.size() - 1) {
            return false;
        }
        if (count > 1) {
            return true;
        }

        if (list.get(index) + list.get(index + 1) == 0 && index != list.size() - 1) {
            count += 1;
        } else if (Math.abs(list.get(index)) == list.get(index + 1) && index != list.size() - 1
                || list.get(index) == Math.abs(list.get(index + 1)) && index != list.size() - 1) {
            count += 1;

        }

        if (list.get(index) < 0) {
            count += 1;
        }
        return containsNegativePair(list, index, count);

    }
}