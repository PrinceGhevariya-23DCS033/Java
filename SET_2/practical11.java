import java.util.*;

public class practical11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.print("Enter the input string: ");
        input = sc.nextLine();

        System.out.println("Enter 1 for finding the length of the string");
        System.out.println("Enter 2 for replacing characters with 'h'");
        System.out.println("Enter 3 for converting the string to lowercase");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.println("Length of the string is " + input.length());
                break;
            case 2:
                System.out.print("Enter the character to replace: ");
                char ch1 = sc.nextLine().charAt(0);
                String s = input.replace(ch1, 'h');
                System.out.println("String after replacement is " + s);
                break;
            case 3:
                String s1 = input.toLowerCase();
                System.out.println("String after conversion to lowercase is " + s1);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
