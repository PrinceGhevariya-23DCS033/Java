import java.util.Scanner;

public class Practical23 {
   public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      sign s = new sign();
      s.print();

      in.close();
   }
}

interface shape {
   public String shap_name = "";

   public String getColor();

   public void setColor(String c);

   public void printdata();

   
   default void defaultMethod() {
      System.out.println("This is a default method in the shape interface.");
   }
}

class circle implements shape {
   protected String color;
   protected int radius;
   public String shap_name = "CIRCLE";

   public String getColor() {
      return color;
   }

   public void setColor(String c) {
      color = c;
   }

   public int getRadius() {
      return radius;
   }

   public void setRadius(int r) {
      radius = r;
   }

   public String getShapename() {
      return shap_name;
   }

   public void printdata() {
      System.out.println("NAME : " + getShapename());
      System.out.println("COLOR : " + getColor());
      System.out.println("RADIUS : " + getRadius());
   }

   
   public void defaultMethod() {
      System.out.println("This is the overridden default method in the circle class.");
   }
}

class rectangle implements shape {
   public String shap_name = "RECTANGLE";
   protected String color;
   protected int height, width;

   public String getColor() {
      return color;
   }

   public void setColor(String c) {
      color = c;
   }

   public int getHeight() {
      return height;
   }

   public void setHeight(int r) {
      height = r;
   }

   public int getWidth() {
      return width;
   }

   public void setWidth(int r) {
      width = r;
   }

   public String getShapename() {
      return shap_name;
   }

   public void printdata() {
      System.out.println("NAME : " + getShapename());
      System.out.println("COLOR : " + getColor());
      System.out.println("HEIGHT : " + getHeight());
      System.out.println("WIDTH : " + getWidth());
   }

   

   public void defaultMethod() {
      System.out.println("This is the overridden default method in the rectangle class.");
   }
}

class sign {
   Scanner in = new Scanner(System.in);
   private String t;

   public void print() {
      System.out.println("ENTER SHAPE [1. RECTANGLE 2. CIRCLE] : ");
      int n = in.nextInt();
      rectangle r = new rectangle();
      circle c = new circle();
      if (n == 1) {
         System.out.println("ENTER COLOR : ");
         r.setColor(in.next());
         System.out.println("ENTER HEIGHT : ");
         r.setHeight(in.nextInt());
         System.out.println("ENTER WIDTH : ");
         r.setWidth(in.nextInt());
      } else {
         System.out.println("ENTER COLOR : ");
         c.setColor(in.next());
         System.out.println("ENTER RADIUS : ");
         c.setRadius(in.nextInt());
      }
      System.out.println("ENTER TEXT : ");
      in.nextLine();
      t = in.nextLine();
      if (n == 1) {
         System.out.println("SIGN DETAIL :- ");
         r.printdata();
         r.defaultMethod(); 
         System.out.println(t);
      } else {
         System.out.println("SIGN DETAIL :- ");
         c.printdata();
         c.defaultMethod();
         System.out.println(t);
      }
      in.close();
   }
}