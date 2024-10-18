
import java.util.Scanner;

public class Practical7{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the string: ");
        int n = sc.nextInt();
        String input ;
        String response ;

        System.out.print("Enetr the string : ");
        input = sc.next();
        System.out.println();

        response =input.substring(0,3);

         System.out.print("Enter the size you want to print: ");
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            
                System.out.print( response);
            }
        }

    
    }

