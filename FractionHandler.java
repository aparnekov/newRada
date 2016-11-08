
import com.sun.org.apache.xerces.internal.impl.dv.dtd.ListDatatypeValidator;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class FractionHandler {
    static {
        System.out.println("Доброго часу доби! Це весела правдоподібна програмулька ВЕРХОВНА РАДА");
    }

    private FractionMembers fractionMembers = new FractionMembers();

    public void addFraction() {
        Map<String, List<Deputy>> frMembers = fractionMembers.getFractionsAll();// ств. мапу(об'єкт) зі всіма фракціями.
        fractionMembers.setFractionsAll(frMembers); //frMembers відповідає FractionsAll()

        System.out.println("Введіть назву фракції:\n");

        MyScanner myScanner = new MyScanner();  // створємо об'єкт класу МуScanner
        myScanner.writeString(); // перевіряємо чи введене з консолі це слово.

        String fractionName = myScanner.getName(); // створюємо змінну в яку записуємо введене зконсолі а саме ім'я фракціїї
        List<Deputy> fraction = new ArrayList<>(); // ств. об'єкт як фракцію, якій дамо імя з консолі і вподальшомудодамо депутатів
        fractionMembers.getFractionsAll().put(fractionName, fraction); // викликаємо ліст з фракціями в який додаємо фракцію (пусту)
        System.out.println("Ми добавили вашу фракцію");


    }

    public void removeFraction() {
        Map<String, List<Deputy>> frMembers = fractionMembers.getFractionsAll(); // ств. мапу(об'єкт) зі всіма фракціями.
        fractionMembers.setFractionsAll(frMembers);

        System.out.println("Напишіть яку фракцію потрібно видалити з парламенту?");
        System.out.println("samopomich");
        System.out.println("blokPoroshenko");
        System.out.println("narodnyyFront");
        System.out.println("olegLyashko");
        System.out.println("volyaNarodu");
        MyScanner myScanner = new MyScanner(); // створємо об'єкт класу МeScanner
        myScanner.writeString();// перевіряємо чи введене з консолі це слово.
        String fractionName = myScanner.getName(); // створюємо змінну в яку записуємо введене зконсолі а саме ім'я фракціїї
        List<Deputy> fraction = new ArrayList<>(); // ств. об'єкт як фракцію, якій дамо імя з консолі і вподальшому додамо депутатів
        fractionMembers.getFractionsAll().remove(fractionName, fraction);// викликаємо ліст з фракціями з якого видаляємо фракцію.

        System.out.println("Фракцію " + fractionName + " вигнали з парламенту за не виконання обов'язків!");
    }


    public void showAllFractions() {
        System.out.println(fractionMembers.getFractionsAll().toString());
    }

    public void showOneFraction() {
        System.out.println("Оберіть фракцію, депутатів якої Ви хочете побачити:\n");
        System.out.println("1 - Самопоміч");
        System.out.println("2 - Блок Порошенко");
        System.out.println("3 - Народний Фронт");
        System.out.println("4 - Блок Олега Ляшко");
        System.out.println("5 - Воля Народу");

        MyScanner myScanner = new MyScanner();  // створємо об'єкт класу МeScanner
        myScanner.writeNumber(); // перевіряємо чи введене з консолі це число.
        myScanner.getNumber();
        switch (myScanner.getNumber()) {
            case 1:
                System.out.println(fractionMembers.getSapmopomich().toString());
                break;
            case 2:
                System.out.println(fractionMembers.getBlokPoroshenko().toString());
                break;
            case 3:
                System.out.println(fractionMembers.getNarodnyyFront().toString());
                break;
            case 4:
                System.out.println(fractionMembers.getOlegLyashko().toString());
                break;
            case 5:
                System.out.println(fractionMembers.getVolyaNarodu().toString());
                break;
            default:
                System.out.println("Виберіть будь-ласка цифру від <1> до <5>!");
        }

    }

    public void sortFractions(String text, Comparator<Deputy> comparator) {

        System.out.println("Оберіть фракцію, депутатів якої Ви відсортувати за " + text + "\n");
        System.out.println("1 - Самопоміч");
        System.out.println("2 - Блок Порошенко");
        System.out.println("3 - Народний Фронт");
        System.out.println("4 - Блок Олега Ляшко");
        System.out.println("5 - Воля Народу");

        MyScanner myScanner = new MyScanner();  // створємо об'єкт класу МeScanner
        myScanner.writeNumber(); // перевіряємо чи введене з консолі це число.
        myScanner.getNumber();
        switch (myScanner.getNumber()) {
            case 1:
                fractionMembers.getSapmopomich().sort(comparator);
                for (Deputy o : fractionMembers.getSapmopomich()) {
                    System.out.println(o);
                }
                System.out.println();
                break;
            case 2:
                fractionMembers.getBlokPoroshenko().sort(comparator);
                for (Deputy o : fractionMembers.getBlokPoroshenko()) {
                    System.out.println(o);
                }
                System.out.println();
                break;
            case 3:
                fractionMembers.getNarodnyyFront().sort(comparator);
                for (Deputy o : fractionMembers.getNarodnyyFront()) {
                    System.out.println(o);
                }
                System.out.println();
                break;
            case 4:
                fractionMembers.getOlegLyashko().sort(comparator);
                for (Deputy o : fractionMembers.getOlegLyashko()) {
                    System.out.println(o);
                }
                System.out.println();
                break;
            case 5:
                fractionMembers.getVolyaNarodu().sort(comparator);
                for (Deputy o : fractionMembers.getVolyaNarodu()) {
                    System.out.println(o);
                }
                System.out.println();
                break;
            default:
                System.out.println("Виберіть будь-ласка цифру від <1> до <5>!");
        }
    }
}
