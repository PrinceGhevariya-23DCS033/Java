import java.util.*;
<<<<<<< Updated upstream
public class prectica24 {
=======
public class Practical24 {
>>>>>>> Stashed changes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int ans;
        System.out.print("Enetr the value of x and y");
        x = sc.nextInt();
        y = sc.nextInt();
<<<<<<< Updated upstream
        ans=x/y;
        int te=ans;
       try {
           ans;
       } catch (Exception e) {
        System.out.println("Exception is caught"+e.toString());
       }
       System.out.println("The ans of the x/y is  " + ans);





=======
        
        try {
           ans=x/y;
           System.out.println("The answer is "+ans);
           
       } catch (Exception e) {
        System.out.println("Exception is caught"+e.toString());
       }
       
>>>>>>> Stashed changes

        }
    }

    

