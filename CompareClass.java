import java.util.Comparator;

public class CompareClass implements Comparator<Deputy> {

    public int compare(Deputy d1, Deputy d2){
        return d1.getAge() - d2.getAge();
    }
}
