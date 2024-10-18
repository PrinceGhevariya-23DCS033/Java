import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 100;
        double[] price = { 8, 12, 5, 7.5, 2 };

        System.out.println("Enter the code for billing:");
        System.out.println("1 - for motor");
        System.out.println("2 - for fan");
        System.out.println("3 - for tube");
        System.out.println("4 - for wire");
        System.out.println("5 - for other");

        int res = sc.nextInt();
        int ti;

        switch (res) {
            case 1:
                System.out.print("Enter the quantity: ");
                ti = sc.nextInt();
                System.out.println("Your bill is " + (base * price[0] * ti) / 100);
                break;

            case 2:
                System.out.print("Enter the quantity: ");
                ti = sc.nextInt();
                System.out.println("Your bill is " + (base * price[1] * ti) / 100);
                break;

            case 3:
                System.out.print("Enter the quantity: ");
                ti = sc.nextInt();
                System.out.println("Your bill is " + (base * price[2] * ti) / 100);
                break;

            case 4:
                System.out.print("Enter the quantity: ");
                ti = sc.nextInt();
                System.out.println("Your bill is " + (base * price[3] * ti) / 100);
                break;

            case 5:
                System.out.print("Enter the quantity: ");
                ti = sc.nextInt();
                System.out.println("Your bill is " + (base * price[4] * ti) / 100);
                break;

            default:
                System.out.println("Invalid code entered.");
        }
    }
}
