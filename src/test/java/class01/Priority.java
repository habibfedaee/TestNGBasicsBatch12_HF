package class01;

import org.testng.annotations.Test;

public class Priority {
    //priority by default is zero 0
    @Test(priority = 3)
    public void First(){
        System.out.println("first");
    }

    @Test(priority = 2)
    public void Second(){
        System.out.println("second");
    }

    @Test(priority = 1)
    public void Third(){
        System.out.println("third");
    }
}
