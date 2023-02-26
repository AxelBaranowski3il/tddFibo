import static org.junit.Assert.*;

public class FiboTest {

    @org.junit.Test
    public void testResFibo1() {
        assertEquals("1\n", Fibo.resFibo(1));
    }

    @org.junit.Test
    public void testResFibo2() {
        assertEquals("1\n1\n", Fibo.resFibo(2));
    }
}