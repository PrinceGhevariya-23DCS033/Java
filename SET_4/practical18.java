import java.util.*;

class member {
    String name;
    int age;
    long pho;
    String add;
    int sal;

    member() {
    }

    public static int printSalary(int sal) {
        return sal;
    }
}

class manager extends member {
    String dept;
}

class employee extends member {
    String spec;
}

public class practical18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        employee emp = new employee();
        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Age: ");
        emp.age = sc.nextInt();
        System.out.print("Phone number: ");
        emp.pho = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Address: ");
        emp.add = sc.nextLine();
        System.out.print("Salary: ");
        emp.sal = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Specialization: ");
        emp.spec = sc.nextLine();

        
        manager mgr = new manager();
        System.out.println("Enter manager details:");
        System.out.print("Name: ");
        mgr.name = sc.nextLine();
        System.out.print("Age: ");
        mgr.age = sc.nextInt();
        System.out.print("Phone number: ");
        mgr.pho = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Address: ");
        mgr.add = sc.nextLine();
        System.out.print("Salary: ");
        mgr.sal = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Department: ");
        mgr.dept = sc.nextLine();

       int sam= member.printSalary(emp.sal);
       System.out.println("The salary of the employee is :"+sam); 

       int sam1= member.printSalary(mgr.sal);
       System.out.println("The salry of the manager is :"+sam1);
        
    }
}
