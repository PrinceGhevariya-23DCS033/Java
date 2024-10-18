
import java.util.*;

public class Practical33 implements Runnable {
    
@Override
    public void run() {
        
        System.out.println(" thread is created");
       
       

    }

    public static void main(String[] args) {

        System.out.println("Enter  the total number of the tread you want to creat :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Practical33 obj = new Practical33();
        for (int i = 1; i <=n; i++) {
           
            Thread t = new Thread(obj);
            t.start();

        }

    }
}
