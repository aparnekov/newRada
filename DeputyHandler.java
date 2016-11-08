import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class DeputyHandler {

    private FractionMembers fractionMembers = new FractionMembers();
    MyScanner myScanner = new MyScanner();  // створємо об'єкт класу МуScanne

    public Deputy addDeputyToFraction() {

        System.out.println("Додаємо депутата, введіть будь-ласка значення властиві депутату а саме:");

        int age;
        int height;
        int weight;
        String firstName;
        String lastName;
        boolean bribeTaker;

        System.out.println("Який вік депутата? (вкажіть цифру): ");
        myScanner.writeNumber(); // перевір
        age = myScanner.getNumber(); // створюємо змінну в яку записуємо введене зконсолі а саме ім'я фракціїї


        System.out.println("Який ріст депутата? (вкажіть цифру): ");
        myScanner.writeNumber();
        height = myScanner.getNumber();


        System.out.println("Яка вага депутата? (вкажіть цифру): ");
        myScanner.writeNumber();
        weight = myScanner.getNumber();


        System.out.println("Яке прізвище депутата? (напишіть текст): ");
        myScanner.writeString();
        lastName = myScanner.getName();


        System.out.println("Яке ім'я депутата? (напишіть текст): ");
        myScanner.writeString();
        firstName = myScanner.getName();


        System.out.println("Чи є депутат хабарником? <true> - так, <false> - ні : ");
        myScanner.chooseBriber();
        bribeTaker = myScanner.getBribeTaker();

        Deputy deputy = new Deputy(age, height, weight, firstName, lastName, bribeTaker);
        System.out.println("Ваш депутат створений- " + deputy.toString());

        Map<String, List<Deputy>> frMembers = fractionMembers.getFractionsAll(); // ств. мапу(об'єкт) зі всіма фракціями.
        fractionMembers.setFractionsAll(frMembers);

        System.out.println("В яку фракцію занести створеного депутата");
        System.out.println("1 - Самопоміч");
        System.out.println("2 - Блок Порошенко");
        System.out.println("3 - Народний Фронт");
        System.out.println("4 - Блок Олега Ляшко");
        System.out.println("5 - Воля Народу");
        myScanner.writeNumber();
        switch (myScanner.getNumber()) {
            case 1:
                fractionMembers.getSapmopomich().add(deputy);
                System.out.println("депутат  " + deputy.getLastName().toString() + "був занесений до фракціїї Самопоміч");
                break;
            case 2:
                fractionMembers.getBlokPoroshenko().add(deputy);
                System.out.println("депутат  " + deputy.getLastName().toString() + "був занесений до фракціїї Блок Порошенко");
                break;
            case 3:
                fractionMembers.getNarodnyyFront().add(deputy);
                System.out.println("депутат  " + deputy.getLastName().toString() + "був занесений до фракціїї Народний Фронт");
                break;
            case 4:
                fractionMembers.getOlegLyashko().add(deputy);
                System.out.println("депутат  " + deputy.getLastName().toString() + "був занесений до фракціїї Олег Ляшко");
                break;
            case 5:
                fractionMembers.getVolyaNarodu().add(deputy);
                System.out.println("депутат  " + deputy.getLastName().toString() + "був занесений до фракціїї Воля Народу");
                break;
            default:
        }
        return deputy;

    }


    void removeDeputyFromFraction() {
        System.out.println("Оберіть фракцію з якої потрібно вигнати депутата");
        System.out.println("1 - Самопоміч");
        System.out.println("2 - Блок Порошенко");
        System.out.println("3 - Народний Фронт");
        System.out.println("4 - Блок Олега Ляшко");
        System.out.println("5 - Воля Народу");
        // MyScanner myScanner = new MyScanner();
        myScanner.writeNumber();
        myScanner.getNumber();
        switch (myScanner.getNumber()) {
            case 1:
                System.out.println(fractionMembers.getSapmopomich().toString());
                System.out.println("Вкажіть номер депутата по списку для видалення, починаючи з <0> :");
                myScanner.writeNumber();
                myScanner.getNumber();
                switch (myScanner.getNumber()) {
                    case 1:
                        fractionMembers.getSapmopomich().remove(0);
                        System.out.println("Був видалений депутат" + (fractionMembers.getSapmopomich().remove(0)).toString());
                        break;
                    case 2:
                        fractionMembers.getSapmopomich().remove(1);
                        System.out.println("Був видалений депутат" + (fractionMembers.getSapmopomich().remove(1)).toString());
                        break;
                    case 3:
                        fractionMembers.getSapmopomich().remove(2);
                        System.out.println("Був видалений депутат" + (fractionMembers.getSapmopomich().remove(2)).toString());
                        break;
                    case 4:
                        fractionMembers.getSapmopomich().remove(3);
                        System.out.println("Був видалений депутат" + (fractionMembers.getSapmopomich().remove(3)).toString());
                        break;
                }
                break;
            case 2:
                System.out.println(fractionMembers.getBlokPoroshenko().toString());
                System.out.println("Вкажіть номер депутата по списку для видалення, починаючи з <0> :");
                myScanner.writeNumber();
                myScanner.getNumber();
                switch (myScanner.getNumber()) {
                    case 1:
                        fractionMembers.getBlokPoroshenko().remove(0);
                        System.out.println("Був видалений депутат" + (fractionMembers.getBlokPoroshenko().remove(0)).toString());
                        break;
                    case 2:
                        fractionMembers.getBlokPoroshenko().remove(1);
                        System.out.println("Був видалений депутат" + (fractionMembers.getBlokPoroshenko().remove(1)).toString());
                        break;
                    case 3:
                        fractionMembers.getBlokPoroshenko().remove(2);
                        System.out.println("Був видалений депутат" + (fractionMembers.getBlokPoroshenko().remove(2)).toString());
                        break;
                    case 4:
                        fractionMembers.getBlokPoroshenko().remove(3);
                        System.out.println("Був видалений депутат" + (fractionMembers.getBlokPoroshenko().remove(3)).toString());
                        break;
                }
                break;
            case 3:
                System.out.println(fractionMembers.getNarodnyyFront().toString());
                System.out.println("Вкажіть номер депутата по списку для видалення, починаючи з <0> :");
                myScanner.writeNumber();
                myScanner.getNumber();
                switch (myScanner.getNumber()) {
                    case 1:
                        fractionMembers.getNarodnyyFront().remove(0);
                        System.out.println("Був видалений депутат" + (fractionMembers.getNarodnyyFront().remove(0)).toString());
                        break;
                    case 2:
                        fractionMembers.getNarodnyyFront().remove(1);
                        System.out.println("Був видалений депутат" + (fractionMembers.getNarodnyyFront().remove(1)).toString());
                        break;
                    case 3:
                        fractionMembers.getNarodnyyFront().remove(2);
                        System.out.println("Був видалений депутат" + (fractionMembers.getNarodnyyFront().remove(2)).toString());
                        break;
                    case 4:
                        fractionMembers.getNarodnyyFront().remove(3);
                        System.out.println("Був видалений депутат" + (fractionMembers.getNarodnyyFront().remove(3)).toString());
                        break;
                }
                break;
            case 4:
                System.out.println(fractionMembers.getOlegLyashko().toString());
                System.out.println("Вкажіть номер депутата по списку для видалення, починаючи з <0> :");
                myScanner.writeNumber();
                myScanner.getNumber();
                switch (myScanner.getNumber()) {
                    case 1:
                        fractionMembers.getOlegLyashko().remove(0);
                        System.out.println("Був видалений депутат" + (fractionMembers.getOlegLyashko().remove(0)).toString());
                        break;
                    case 2:
                        fractionMembers.getOlegLyashko().remove(1);
                        System.out.println("Був видалений депутат" + (fractionMembers.getOlegLyashko().remove(1)).toString());
                        break;
                    case 3:
                        fractionMembers.getOlegLyashko().remove(2);
                        System.out.println("Був видалений депутат" + (fractionMembers.getOlegLyashko().remove(2)).toString());
                        break;
                    case 4:
                        fractionMembers.getOlegLyashko().remove(3);
                        System.out.println("Був видалений депутат" + (fractionMembers.getOlegLyashko().remove(3)).toString());
                        break;
                }
                break;
            case 5:
                System.out.println(fractionMembers.getVolyaNarodu().toString());
                System.out.println("Вкажіть номер депутата по списку для видалення, починаючи з <0> :");
                myScanner.writeNumber();
                myScanner.getNumber();
                switch (myScanner.getNumber()) {
                    case 1:
                        fractionMembers.getVolyaNarodu().remove(0);
                        System.out.println("Був видалений депутат" + (fractionMembers.getVolyaNarodu().remove(0)).toString());
                        break;
                    case 2:
                        fractionMembers.getVolyaNarodu().remove(1);
                        System.out.println("Був видалений депутат" + (fractionMembers.getVolyaNarodu().remove(1)).toString());
                        break;
                    case 3:
                        fractionMembers.getVolyaNarodu().remove(2);
                        System.out.println("Був видалений депутат" + (fractionMembers.getVolyaNarodu().remove(2)).toString());
                        break;
                    case 4:
                        fractionMembers.getVolyaNarodu().remove(3);
                        System.out.println("Був видалений депутат" + (fractionMembers.getVolyaNarodu().remove(3)).toString());
                        break;
                }
                break;
        }
    }

    void changeDeputyInFraction() {
        //if (змінна сканеру відповідає значенню){
        // якого депутата потрібно видалити?:
        // відповідь на сканері
        // записуємо нові дані до змінної та видаляємо з фракйції
        // та результат вивести на екран
        //   System.out.println("Депутат" - "Deputy ,"був видалений з фракції" + Fraction
    }

    void showAllBribeTakersInFraction(String bool, Comparator<Deputy> comparator) {
        System.out.println("Оберіть фракцію з хабарниками депутатами");
        System.out.println("1 - Самопоміч");
        System.out.println("2 - Блок Порошенко");
        System.out.println("3 - Народний Фронт");
        System.out.println("4 - Блок Олега Ляшко");
        System.out.println("5 - Воля Народу");
        myScanner.writeNumber();
        myScanner.getNumber();
        switch (myScanner.getNumber()) {
            case 1:
                fractionMembers.getSapmopomich().sort(comparator);
                for (Deputy o : fractionMembers.getSapmopomich()) {
                    if (o.getBribeTaker() == false)
                        System.out.println(o);
                }
                break;
            case 2:
                fractionMembers.getBlokPoroshenko().sort(comparator);
                for (Deputy o : fractionMembers.getBlokPoroshenko()) {
                    if (o.getBribeTaker() == false)
                        System.out.println(o);
                }
                break;
            case 3:
                fractionMembers.getNarodnyyFront().sort(comparator);
                for (Deputy o : fractionMembers.getNarodnyyFront()) {
                    if (o.getBribeTaker() == false)
                        System.out.println(o);
                }
                break;
            case 4:
                fractionMembers.getOlegLyashko().sort(comparator);
                for (Deputy o : fractionMembers.getOlegLyashko()) {
                    if (o.getBribeTaker() == false)
                        System.out.println(o);
                }
                break;
            case 5:
                fractionMembers.getVolyaNarodu().sort(comparator);
                for (Deputy o : fractionMembers.getVolyaNarodu()) {
                    if (o.getBribeTaker() == false)
                        System.out.println(o);
                }
                break;
            default:
                this.showAllBribeTakersInFraction("Habarnyk", new CompareBoolean());
        }
    }

    void removeAllBribeTakersFromFraction(String bool, Comparator<Deputy> comparator) {
        System.out.println("Оберіть фракцію з якої потрібно видалити хабарників");
        System.out.println("1 - Самопоміч");
        System.out.println("2 - Блок Порошенко");
        System.out.println("3 - Народний Фронт");
        System.out.println("4 - Блок Олега Ляшко");
        System.out.println("5 - Воля Народу");
        myScanner.writeNumber();
        myScanner.getNumber();
        switch (myScanner.getNumber()) {
            case 1:
                fractionMembers.getSapmopomich().sort(comparator);
                for (Deputy o : fractionMembers.getSapmopomich()) {
                    if (o.getBribeTaker() == false) {
                        fractionMembers.getSapmopomich().remove(o);
                    }
                }
                    break;
                    case 2:
                        fractionMembers.getBlokPoroshenko().sort(comparator);
                        for (Deputy o : fractionMembers.getBlokPoroshenko()) {
                            if (o.getBribeTaker() == false)
                                System.out.println(o);
                        }
                        break;
                    case 3:
                        fractionMembers.getNarodnyyFront().sort(comparator);
                        for (Deputy o : fractionMembers.getNarodnyyFront()) {
                            if (o.getBribeTaker() == false)
                                System.out.println(o);
                        }
                        break;
                    case 4:
                        fractionMembers.getOlegLyashko().sort(comparator);
                        for (Deputy o : fractionMembers.getOlegLyashko()) {
                            if (o.getBribeTaker() == false)
                                System.out.println(o);
                        }
                        break;
                    case 5:
                        fractionMembers.getVolyaNarodu().sort(comparator);
                        for (Deputy o : fractionMembers.getVolyaNarodu()) {
                            if (o.getBribeTaker() == false)
                                System.out.println(o);
                        }
                        break;
                    default:
                        this.showAllBribeTakersInFraction("Habarnyk", new CompareBoolean());
                }
        }
    }



