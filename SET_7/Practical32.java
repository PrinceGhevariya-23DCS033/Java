
public class Practical32 implements Runnable{
    public void run(){
        System.out.println("hello world");
    }
    
    
    public static void main(String[]args)
    {
        Practical32 t2 =new Practical32();
        Thread t1=new Thread(t2);
        t1.start();
        
    
}
 }

