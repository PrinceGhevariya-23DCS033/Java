import java.util.*;
public class Practical10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.print("Enter the string: ");
        input=sc.nextLine();

        System.out.println("Enetr 1 for the find lenghth of the String ");
        System.out.println("Enetr 2 for convert string to the lower case  ");
        System.out.println("Enetr 3 for convert string to the upper case  ");
        System.out.println("Enetr 4 for revers the string: ");
        System.out.println("Enetr 5 for the sort the string ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("The length of the string is: "+input.length());
            break;
            case 2:
            System.out.println("The lower case of the string is: "+input.toLowerCase());
            break;
            case 3:
            System.out.println("The upper case of the string is: "+input.toUpperCase());
            break;
        
            case 4:
            StringBuilder reversed = new StringBuilder(input);
            reversed.reverse();
            System.out.println("Reversed string: " + reversed.toString());
            break;

           
            

            case 5:
            char[] charArray = input.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            System.out.println("Sorted string: " + sortedString);
            

            break;
        }
    }




}