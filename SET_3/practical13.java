import java.util.Scanner;
import java.util.*;

 class Employee {
    Scanner sc =new Scanner (System.in);
    String first_name= "";
    String  last_name;
    double salary;

    Employee(){

    }

    Employee(String f,String l,double s){
        first_name=f;
        last_name=l;
        salary=s;

    }

    void set_first_name() {
        first_name = sc.nextLine();
    }

    void set_last_name() {
        last_name = sc.nextLine();
    }

    void set_salary() {
        salary = sc.nextDouble();
    }

    String get_first_name() {
        
        return first_name;
    }

    String get_last_name() {
        return last_name;
    }

    double get_salary(){
        return salary;
    }

}

public class practical13 {

    public static void main(String arr[]){
        Employee s=new Employee();
        System.out.print("Enetr the first name :");
        s.set_first_name();
        System.out.print("Enetr the last name :");
        s.set_last_name();
        System.out.print("Enetr the salary:");
        s.set_salary();

        System.out.print("Your first name is : ");
        String m=s.get_first_name();
        System.out.print(m);
        System.out.println();
        System.out.print("Your last name is : ");
        String l=s.get_last_name();
        System.out.print(l);
        System.out.println();

        double sa=s.get_salary();
        if(sa<0){
            sa=0;
        }else{
            sa=(sa*0.1) + sa;
        }
        
        System.out.print("Your updated salary is ");
       
        System.out.print(sa);
 }
}
