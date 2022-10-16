import java.util.Scanner;

public class H016 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Weight:");
        int weight = scan.nextInt();

        convertPounds(weight);
        scan.close();

    }

    private static void convertPounds(int weight) {
        int ounces;
        int pounds;

        ounces = weight % 16;
        pounds = weight / 16;

        System.out.println(weight + " Ounces becomes " + pounds + " Pounds" +" "+ounces + " Ounces");
    }
}