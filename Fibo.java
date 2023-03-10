
import java.util.Iterator;

public class Fibo implements Iterable<Integer>{

    private int borne;

    public Fibo(int borne){
        this.borne = borne;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new FiboIterator(borne);
    }

    public int getBorne() {
        return borne;
    }

    public static String resFibo(int bor){
        String res = "";
        for (Integer i : new Fibo(bor))
            res += i + "\n";
        return res;
    }
    public static void main(String[] args){
        for (Integer i : new Fibo(20))
            System.out.println(i);

        System.out.println(resFibo(20));
    }
}
