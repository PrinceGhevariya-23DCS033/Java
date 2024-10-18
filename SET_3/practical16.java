import java.util.Scanner;
public class practical16
{
   public static void main(String args[])
   {
      Scanner in = new Scanner(System.in);
      System.out.println("ENTER FIRST COMPLEX NUMBER : ");
      float x1=in.nextFloat();
      float y1=in.nextFloat();
      complex c1=new complex(x1, y1);
      System.out.println("ENTER SECOND COMPLEX NUMBER : ");
      float x2=in.nextFloat();
      float y2=in.nextFloat();
      complex c2=new complex(x2, y2);
      System.out.println("FIRST NUMNER : ");
      c1.print();
      System.out.println("SECOND NUMNER : ");
      c2.print();
      complex c3=new complex();
      complex c4=new complex();
      complex c5=new complex();
      c3=c1.sum(c2);
      c4=c1.diff(c2);
      c5=c1.mux(c2);
      System.out.println("SUM : ");
      c3.print();
      System.out.println("DIFFERENCE : ");
      c4.print();
      System.out.println("MULTIPLICATION : ");
      c5.print(); 
      
   }
}
class complex{
    float x;
    float y;
   complex(){}
   complex(float x, float y)
   {
      this.x=x;
      this.y=y;
   }
   complex sum(complex c)
   {
      complex temp=new complex();
      temp.x=x+c.x;
      temp.y=y+c.y;
      return temp;
   }
   complex diff(complex c)
   {
      complex temp=new complex();
      temp.x=x-c.x;
      temp.y=y-c.y;
      return temp;
   }
   complex mux(complex c)
   {
      complex temp=new complex();
      temp.x=x*(c.x)-y*(c.y);
      temp.y=x*(c.y)+y*(c.x);
      return temp;
   }
   void print()
   {
      if(y>0)
      {
      System.out.println(x+"+i"+y);}
      else{
         System.out.println(x+"-i"+(-y));}
   }
}
