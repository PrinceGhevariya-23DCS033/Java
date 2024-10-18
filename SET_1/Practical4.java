import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	float expance[] =new float[30];
	float sum=0;
	
	for(int i=1;i<30;i++){
	System.out.print("Enter the expance of  day " +i +" : "); 
	expance[i]= sc.nextFloat();
	sum=sum+expance[i];
	
	}
	System.out.println("your totel expance is : " +sum);
}
}
