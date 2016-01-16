

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Zadanie2Test {

    static long czas;

    public Zadanie2Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        czas=System.currentTimeMillis();
    }

    @After
    public void tearDown() {
        System.out.println(System.currentTimeMillis()-czas+" milisekund");
    }

    @Test
    public void testLosuj() {
        Zadanie2.losuj();

    }

}
