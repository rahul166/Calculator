import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MainTest {
    private static final double ERR=1e-14;
    Main calc=new Main();
    @Test
    public void factTP() {

        assertEquals(6,calc.fact(3),ERR);
        assertEquals(720,calc.fact(6),ERR);
    }
    @Test
    public void factFP() {
//        Assertions.assertEquals();void
        assertNotEquals(4,calc.fact(3),ERR);
        assertNotEquals(725,calc.fact(6),ERR);
    }
    @Test
    public void getsqrtTP() {

        assertEquals(2,calc.getsqrt(4),ERR);
        assertEquals(3,calc.getsqrt(9),ERR);
    }
    @Test
    public void getsqrtFP() {

        assertNotEquals(1,calc.getsqrt(4),ERR);
        assertNotEquals(5,calc.getsqrt(9),ERR);
    }
    @Test
    public void getlogTP() {

        assertEquals(0,calc.getlog(1),ERR);
//        assertEquals(720,calc.fact(6));
    }
    @Test
    public void getlogFP() {

        assertNotEquals(3,calc.getlog(1),ERR);
//        assertEquals(720,calc.fact(6));
    }

    @Test
    public void getpowTP() {
        assertEquals(4,calc.getpow(2,2),ERR);
        assertEquals(9,calc.getpow(3,2),ERR);
    }
    @Test
    public void getpowFP() {
        assertNotEquals(8,calc.getpow(2,2),ERR);
        assertNotEquals(10,calc.getpow(3,2),ERR);
    }
}