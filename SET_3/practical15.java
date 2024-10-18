import java.util.*;

class area {
     int l;
     int b;
     area(){

     }

    public area(int len, int bre) {
        l = len;
        b = bre;
    }

    public int returnarea() {
        return l * b;
    }
}

public class practical15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int bre = sc.nextInt();

        area rectangle = new area(len, bre);

        System.out.println("The area of the rectangle is: " + rectangle.returnarea());

        sc.close();
    }
}
