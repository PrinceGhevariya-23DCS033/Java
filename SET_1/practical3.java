import java.util.Scanner;

class Area {
    double len;
    double bre;

    Area() {

    }

    Area(double l, double b) {
        len = l;
        bre = b;

    }

    double return_area()
    {
        return len * bre;
    }
}

public class practical3{
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b =sc. nextDouble();
        Area s = new Area(l,b);

        double m=s.return_area();
        System.out.println("area of the triangle is "+m);
    }
}
