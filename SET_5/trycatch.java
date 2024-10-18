public class trycatch {
    public static void main(String[] args) {
        
    
    //  int a=10;

    //  int b=0;
    //  int c;
    //  System.out.println("Before");
    //  try{
    //  c=(a/b);
    // }
    // catch(Exception e){
    //  System.out.println("Exception is hand" + e.toString());
    //  System.out.println("Exception is hand" + e.getMessage());
    // e.printStackTrace();
    //  }
    //  System.out.println("After");

    //  int ab[]={1,2,3};
    //  try{
    //  System.out.println(ab[3]);
    //  }catch(Exception e){
    //      System.out.println("Exception is hand" + e.toString());
    //  }

    //  String s="charusat";
    //  try{
    //  System.out.print(s.charAt(9));
    //  }catch(Exception r){
    //      System.out.println("Exception is hand" + r.toString());
    //  }
    
    // String so=null;
    // try{
    
    //     System.out.println(so.length());
    //     }catch(Exception r){
    //         System.out.println("Exception is hand" + r.toString()); 
    //         }
        
            
    // int a[]={1,2,3};
    // try{
    //     System.out.println(a[3]);
    // }
    //     catch(ArrayIndexOutOfBoundsException)
    //     {
    //         System.out.println("hello");
    //     }
    //     catch(Exception r){
    //         System.out.println("Exception is ");
    //     }

//4....................................................................................

    // int a;
    // int b[]={1,2,3};
    // String s="charu";
    // String m=null;
    // try{
    //     a=10/0;
    //     System.out.println(b[3]);
    //     System.out.println(s.charAt(9));
    //     System.out.println(m.length());
    //     }
    //     catch(ArithmeticException e){
    //         System.out.println("Arithmetic Exception is handle" + e.toString());
    //         }
    //         catch(ArrayIndexOutOfBoundsException e){
    //             System.out.println("ArrayIndex is handle" + e.toString());
    //             }
    //             catch(StringIndexOutOfBoundsException e){
    //                 System.out.println("StringIndex is handle" + e.toString());
    //                 }
    //                 catch(NullPointerException e){
    //                     System.out.println("Null is handle" + e.toString());
    //                     }
//...........................................................................................

int d;
int v[]={1,2,3};
String g= "prince";
String gh=null;

try {
        try{
            d=10/0;
            System.out.println(d);
            }
            catch(ArithmeticException e){
                System.out.println("Arithmetic Exception is handle" + e.toString());

        }
        try {
            System.out.println(v[3]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndex is handle" + e.toString());
        }
        try {
            System.out.println(g.charAt(9));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("StringIndex is handle" + e.toString());
                }
    
} catch (Exception e) {
    System.out.println("Arithmetic Exception is handle" + e.toString());
}

}

}
