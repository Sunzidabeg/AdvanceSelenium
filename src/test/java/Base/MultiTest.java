package Base;

import org.testng.annotations.Test;

public class MultiTest {

    @Test(groups = { "a" })
    public void a_test6(){

        System.out.println("I am test1 A");
}

@Test(groups = { "b" })
    public void b_test6(){

        System.out.println("I am test2 B");

    }

    @Test(groups = { "a","b" })
    public void b_test7(){

        System.out.println("I am test2 A and B");

    }

    @Test(groups = { "c" })
    public void b_test8(){

        System.out.println("I am test2 c");

    }

    }
