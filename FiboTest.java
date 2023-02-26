import static org.junit.Assert.*;

public class FiboTest {
    String res20 = "1\n" +
            "1\n" +
            "2\n" +
            "3\n" +
            "5\n" +
            "8\n" +
            "13\n" +
            "21\n" +
            "34\n" +
            "55\n" +
            "89\n" +
            "144\n" +
            "233\n" +
            "377\n" +
            "610\n" +
            "987\n" +
            "1597\n" +
            "2584\n" +
            "4181\n" +
            "6765\n";
    @org.junit.Test
    public void testResFibo1() {
        assertEquals("1\n", Fibo.resFibo(1));
    }

    @org.junit.Test
    public void testResFibo2() {
        assertEquals("1\n1\n", Fibo.resFibo(2));
    }

    @org.junit.Test
    public void testResFibo20() {
        assertEquals(res20, Fibo.resFibo(20));
    }
}