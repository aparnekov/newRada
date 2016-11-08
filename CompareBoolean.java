import java.util.Comparator;


public class CompareBoolean implements Comparator<Deputy> {
    public int compare(Deputy o1, Deputy o2) {
        boolean b1 = o1.getBribeTaker();
        boolean b2 = o2.getBribeTaker();
        if(!b2) {
            return +1;
        }
        if(!b1 ) {
            return -1;
        }
        return 0;
    }
}
