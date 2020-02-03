package Base;

import org.testng.annotations.Test;

public class priority {

        @Test(priority = 'd')
        public void a_test6(){

            System.out.println("I am test1 d");
        }

        @Test(priority = 'c')
        public void b_test6(){

            System.out.println("I am test2 c");

        }

        @Test(priority = 'b')
        public void b_test7(){

            System.out.println("I am test2 b");

        }

        @Test(priority = 'a')
        public void b_test8(){

            System.out.println("I am test2 a");

        }

    }




