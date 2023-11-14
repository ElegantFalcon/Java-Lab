import java.util.*;

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
        

        // It's generally not recommended to explicitly call System.gc()
        System.gc();

        // Letting the JVM decide when to perform garbage collection
    }
}
