import java.util.Scanner;

public class Practical8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the totel number of the Element in array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count =0;
        for(int i = 0; i < n; i++){
            System.out.print("Enetr the "+(i+1) + " Element : ");
            arr[i] = sc.nextInt();
            
            }
            for(int i=0;i<n;i++){
                if(arr[i]==9){
                    count++;
                }
            }
            System.out.print("Your array is :");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
                
            }
            System.out.println();
            System.out.println("The totel nine in the array is :"+count);
            }
}