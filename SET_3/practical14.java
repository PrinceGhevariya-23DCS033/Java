import java.util.Scanner;

class Date {
    Scanner sc = new Scanner(System.in);
    int mon;
    int day;
    int year;
    Date(){

    }
    Date(int m,int d,int y){
        mon=m;
        day=d;
        year=y;
    }

    void set_mon()
    {
        mon=sc.nextInt();
    }

    void set_year() {
        year = sc.nextInt();
    }

    void set_day() {
        day = sc.nextInt();
    }

    int get_mon() {
        return mon;
    }

    int get_day() {
        return day;
    }

    int get_year() {
        return year;
    }

    void get_c(){
        System.out.print(day +"/" + mon +"/" +year +" ");
    }
}

public class practical14{
    public static void main(String arg[]){
        Date s =new Date();

        System.out.print("Enetr the day :");
        s.set_day();
        System.out.print("Enetr the month  :");
        s.set_mon();
        System.out.print("enter the year :");
        s.set_year();
        s.get_c();
    }
}