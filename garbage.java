import java.util.*;
import java.lang.*;

class Employee {
    protected void finalize() {
        System.out.println("garbage collection is performed by JVM");
    }
}

public class garbage {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1=e2 ;

        Employee e = new Employee();
        e = null;
        

       
        System.gc();

       
    }
}
