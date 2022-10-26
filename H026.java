
public class H026 {
    public static void main(String[] args) {
        
        System.out.println(bitFlipString("0110", 0, ""));

    }

    private static String bitFlipString(String s, int index, String ans) {
        char c[] = s.toCharArray();

        if (index > c.length - 1) {
            return ans;
        }
        if (c[index] == '0') {
            ans = ans + '1';
        }
        if (c[index] == '1') {
            ans = ans + '0';
        }
        index++;

        return bitFlipString(s, index, ans);

    }
}