import java.util.Scanner;

public class practical9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int size = input.length();

        for (int i = 0; i < size; i++) {
            char ch = input.charAt(i);
            System.out.print(ch + "" + ch); 
        }

        sc.close();
    }
}
