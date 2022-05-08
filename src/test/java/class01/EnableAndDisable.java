package class01;

import org.testng.annotations.Test;

public class EnableAndDisable {
    // Enable and disable
    // by default enabled = true

    @Test(enabled = false)
    public void First(){
        System.out.println("first");
    }

    @Test(enabled = true)
    public void Second(){
        System.out.println("second");
    }

    @Test(enabled = true)
    public void Third(){
        System.out.println("third");
    }
}
