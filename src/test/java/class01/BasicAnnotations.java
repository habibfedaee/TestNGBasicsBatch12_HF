package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {
    @Test
    public void bfirstTest(){
        System.out.println("This is my first test-case!");
    }

    @Test // if there is no annotation it will not run
    public void asecondTest(){
        System.out.println("Second test-case");
    }

    @Test
    public void cthirdTest(){
        System.out.println("Third test-case");
    }
    // the order of execution is dependent on the order of the method names


    @BeforeMethod
    public void beforeMethod(){
        System.out.println(" ---------- I'm precondition ---------------");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("============= I am postcondition =============");
    }

}
