
import java.util.*;

public class Practical38 {

    ArrayList<Object> list;

    Practical38(Object elements[]) {
        list = new ArrayList<Object>();
        for (int i = 0; i < elements.length; i++) {
            list.add(elements[i]);
        }
    }

    Practical38() {
        list = new ArrayList<Object>();

    }
}