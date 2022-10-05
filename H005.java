import java.util.Scanner;

public class H005 {

    public static boolean triangle(int a, int b, int c) {
        int triangleDegree = 180;
        /*
         * To Check the all angles are above 0 for eg 100 80 0 -->false so check the Statement...
         */
        if (a != 0 && b != 0 && c != 0) {
            if (a + b + c == triangleDegree) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int angle1, angle2, angle3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Three Angels :");
        angle1 = scan.nextInt();
        angle2 = scan.nextInt();
        angle3 = scan.nextInt();

        boolean result = triangle(angle1, angle2, angle3);

        if (result == true) {
            System.out.println("The Three Sides of Triangle  is 180 Degree\t" + result);
        } else {
            System.out.println("The Three Sides of Triangle Degree is not 180 Degree\t" + result);
        }
        scan.close();
    }
}
