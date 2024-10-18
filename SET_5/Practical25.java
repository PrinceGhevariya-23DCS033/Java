import java.util.*;
public class Practical25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5}; 
        int i;
        System.out.println("The array is :");
        for(int j=0;j<=4;j++){
            System.out.print(numbers[j] +" ");
        }
        System.err.println(" ");
        System.out.println("Enter the value of index");
        i=sc.nextInt();
        

        try {
           
            int value = numbers[i]; 
            System.out.println("Value at index 10: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            
        
            System.out.println("Exception is : " + e.getMessage());
        }
    }
}