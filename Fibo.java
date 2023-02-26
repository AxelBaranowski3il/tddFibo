
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

    public static void main(String[] args){
        for (Integer i : new Fibo(20))
            System.out.println(i);
    }
}
