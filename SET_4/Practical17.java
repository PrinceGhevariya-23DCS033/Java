
 class Parent{
    void  parent(){
        System.out.println("This is  Parent class");
    }
    
}

class Child extends Parent{
    void child(){
        System.out.println("This is Child class");
    }
}


public class Practical17{
    public static void main(String arg[]){
    // Parent p = new Parent();
    Child c = new Child();
    // p.parent();
    c.parent();
    }
}
    


