
import java.util.*;

public class FractionMembers {  // - Написати клас FractionMembers, котрий буде містити 3-5 списків(ArrayList),
    private Map<String, List<Deputy>> fractionsAll = new HashMap<>();
    private List<Deputy> sapmopomich = new ArrayList<>();
    private List<Deputy> blokPoroshenko = new ArrayList<>();
    private List<Deputy> narodnyyFront = new ArrayList<>();
    private List<Deputy> olegLyashko = new ArrayList<>();
    private List<Deputy> volyaNarodu = new ArrayList<>();

    public String toString(){
        return String.valueOf(getFractionsAll());
    }

    public FractionMembers() {
        addDepytyToSamopomich();
        addDepytyToBlokPoroshenko();
        addDepytyToNarodnyyFront();
        addDepytyToOlegLyashko();
        addDepytyToVolyaNarody();
        fractionsAll.put("samopomich", sapmopomich);
        fractionsAll.put("blokPoroshenko", blokPoroshenko);
        fractionsAll.put("narodnyyFront", narodnyyFront);
        fractionsAll.put("olegLyashko", olegLyashko);
        fractionsAll.put("volyaNarodu", volyaNarodu);
    }

    void addDepytyToSamopomich() {                                   // - як варант додавання елентів до списку Еррейліст
        sapmopomich.add(new Deputy(56, 180, 88, "Олег", "Березюк", false));
        sapmopomich.add(new Deputy(45, 175, 70, "Олег", "Лаврик", true));
        sapmopomich.add(new Deputy(60, 164, 74, "Єгор", "Соболєв", true));
        sapmopomich.add(new Deputy(40, 185, 60, "Надія", "Опанащук", false));
    }

    void addDepytyToBlokPoroshenko() {
        blokPoroshenko.add(new Deputy(61, 179, 90, "Петро", "Порошенко", true));
        blokPoroshenko.add(new Deputy(45, 175, 70, "Олег", "Лаврик", false));
        blokPoroshenko.add(new Deputy(67, 177, 80, "Олександр", "Третьяков", true));
        blokPoroshenko.add(new Deputy(42, 181, 65, "Оксана", "Продан", false));
    }

    void addDepytyToNarodnyyFront() {
        narodnyyFront.add(new Deputy(49, 169, 80, "Максим", "Бурбак", false));
        narodnyyFront.add(new Deputy(44, 165, 60, "Юрій", "Береза", true));
        narodnyyFront.add(new Deputy(61, 176, 70, "Андрій", "Тетерук", false));
        narodnyyFront.add(new Deputy(43, 172, 75, "Вікторія", "Сюмар", false));
    }

    void addDepytyToOlegLyashko() {
        olegLyashko.add(new Deputy(35, 170, 82, "Олег", "Ляшко", true));
        olegLyashko.add(new Deputy(34, 167, 63, "Андрій", "Лозовой", true));
        olegLyashko.add(new Deputy(46, 178, 74, "Ольга", "Потапчук", false));
        olegLyashko.add(new Deputy(33, 182, 71, "Ігор", "Потапов", true));
    }

    void addDepytyToVolyaNarody() {
        volyaNarodu.add(new Deputy(61, 179, 90, "Іван", "Волдирь", true));
        volyaNarodu.add(new Deputy(45, 175, 70, "Петро", "Петрович", false));
        volyaNarodu.add(new Deputy(67, 177, 80, "Олександр", "Олександрович", true));
        volyaNarodu.add(new Deputy(42, 181, 65, "Оксана", "Оксанівна", false));
    }

    public List<Deputy> getSapmopomich() {
        return sapmopomich;
    }

    public void setSapmopomich(ArrayList<Deputy> sapmopomich) {
        this.sapmopomich = sapmopomich;
    }

    public List<Deputy> getNarodnyyFront() {
        return narodnyyFront;
    }

    public void setNarodnyyFront(ArrayList<Deputy> narodnyyFront) {
        this.narodnyyFront = narodnyyFront;
    }

    public List<Deputy> getBlokPoroshenko() {
        return blokPoroshenko;
    }

    public void setBlokPoroshenko(ArrayList<Deputy> blokPoroshenko) {
        this.blokPoroshenko = blokPoroshenko;
    }

    public List<Deputy> getOlegLyashko() {
        return olegLyashko;
    }

    public void setOlegLyashko(List<Deputy> olegLyashko) {
        this.olegLyashko = olegLyashko;
    }

    public List<Deputy> getVolyaNarodu() {
        return volyaNarodu;
    }

    public void setVolyaNarodu(List<Deputy> volyaNarodu) {
        this.volyaNarodu = volyaNarodu;
    }

    public Map<String, List<Deputy>> getFractionsAll() {
        return fractionsAll;
    }

    public void setFractionsAll(Map<String, List<Deputy>> fractionsAll) {
        this.fractionsAll = fractionsAll;
    }
}



