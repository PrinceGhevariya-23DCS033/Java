
class Shape {
    Shape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
     Rectangle () {

        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    Circle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    Square() {
        System.out.println("Square is a rectangle");
    }
}

public class Practical20 {
    public static void main(String[] args) {
        
        Square sq = new Square();
        
    }
}


