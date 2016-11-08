import java.util.Comparator;

public class CompareClass2 implements Comparator<Deputy> {

    public int compare(Deputy d1, Deputy d2){
        return d1.getLastName().compareTo(d2.getLastName());
    }

}
