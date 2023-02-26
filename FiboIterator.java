
import java.util.Iterator;
public class FiboIterator implements Iterator<Integer>{

    private int borne;
    private int actuel;
    private int suivant;
    private int compteur;
    /**
     * constructor jusqu'à la borne max
     * @param borne
     */
    public FiboIterator(int borne){
        this.borne = borne;
        actuel = 0;
        suivant = 1;
        compteur = 0;
    }
    @Override
    public boolean hasNext() {
        return compteur < borne;
    }

    @Override
    public Integer next() {
        int result = actuel + suivant;
        actuel = suivant;
        suivant = result;
        compteur++;
        return actuel;
    }

}
