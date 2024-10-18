import java.util.Scanner;

public class practical6 {

    public static void main(String[] args) {
        System.out.println("Fibonacci Series ");
         Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number for size of series : ");
            int n = sc.nextInt();
            int n1 = 0, n2 = 1, n3;
            System.out.print("0 1 ");
            for (int i = 2; i < n; i++) {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                System.out.print(n2+ " ");
            }
        }
    }