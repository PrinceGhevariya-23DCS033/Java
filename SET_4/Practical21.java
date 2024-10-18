class degree{
    void getdegree(){
        System.out.println("I got a degree");
    }

}
class undergra extends degree{
    void getdegree(){
        System.out.println("I am an undergraduate");
    }
}
class postgra extends degree{
    void getdegree(){
        System.out.println("I am a postgraduate");
    }
}

public class Practical21 {
    public static void main(String args[]){
        degree d = new degree();
        undergra ug = new undergra();
        postgra pg = new postgra();
        d.getdegree();
        ug.getdegree();
        pg.getdegree();


    }
}
