
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Zadanie1Test {

    public Zadanie1Test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRowanieKwadratowe() {
        System.out.println("oblicz");
        int a = 0;
        int b = 0;
        int c = 5;

        double[] result = Zadanie1.rownanieKwatratowe(a, b, c);
        assertNull(result);
        a = 0;
        b = 6;
        c = -6;

        result = Zadanie1.rownanieKwatratowe(a, b, c);
        double[] exp = {1.0};
        assertArrayEquals(exp, result, 0.0);

        a = 2;
        b = -4;
        c = 2;

        result = Zadanie1.rownanieKwatratowe(a, b, c);
        exp[0] = 1.0;
        assertArrayEquals(exp, result, 0.0);

        a = 1;
        b = -11;
        c = 30;

        result = Zadanie1.rownanieKwatratowe(a, b, c);
        double[] tab = new double[2];
        tab[0] = 5.0;
        tab[1] = 6.0;
        assertArrayEquals(tab, result, 0.0);
    }
}
