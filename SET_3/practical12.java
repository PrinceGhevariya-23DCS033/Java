import java.util.Scanner;

public class practical12 {
    public static void main(String[] args) {
        int pound;
        if (args.length > 0) {
            pound = Integer.parseInt(args[0]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount in Pounds: ");
            pound = sc.nextInt();
            sc.close();
        }

        int ruppes = pound * 100;
        System.out.println(pound + " Pounds is equal to " + ruppes + " Rupees.");
    }
}
