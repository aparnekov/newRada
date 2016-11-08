import java.util.Comparator;
import java.util.Scanner;

public class RadaHandler {
FractionHandler fractionHandler = new FractionHandler();

    public void switchStart() {
        //System.out.println("Доброго часу доби! Це весела правдоподібна програмулька ВЕРХОВНА РАДА");
        System.out.println("З ким Ви хочете працювати:\n");
        System.out.println("1 - з Фракціями");
        System.out.println("2 - з депутатами\n");
        System.out.println("Будь-ласка зробіть свій вибір:\n");
        MyScanner scanner = new MyScanner();
        scanner.writeNumber();
        scanner.getNumber();
        switch (scanner.getNumber()) {
            case 1:
                System.out.println("Ви обрали роботу з фракціями\n");
                System.out.println("Що саме Ви хочете зробити з фракціями? ");
                System.out.println("1 - Додати фракцію; ");
                System.out.println("2 - Видалити фракцію; ");
                System.out.println("3 - Показати всі фракції ");
                System.out.println("4 - Показати одну фракцію ");
                System.out.println("5 - Сортувати фракцію за віком  ");
                System.out.println("6 - Сортувати фракцію за іменем  ");
                switchFractions();
                break;
            case 2:
                System.out.println("Ви обрали роботу з депутатами");
                System.out.println("Що саме Ви хочете зробити з депутатами? ");
                System.out.println("1 - Додати депутата до фракції; ");
                System.out.println("2 - Видалити депутата з фракції; ");
                System.out.println("3 - Змінити депутата у фракції ");
                System.out.println("4 - Показати всіх хабарників у фракції ");
                System.out.println("5 - Видалити всіх хабарників з фракції   ");
                switchDeputy();
                break;
            default:
                System.out.println("Оберіть будь-ласка 1 або 2, дякуємо!");
        }
    }

    public void switchFractions() {
        MyScanner scanner = new MyScanner();
        scanner.writeNumber();
        scanner.getNumber();

        switch (scanner.getNumber()) {
            case 1:
                System.out.println("Ви бажаєте додати фракцію, чудово");
                fractionHandler.addFraction();
                break;
            case 2:
                System.out.println("Ви бажаєте видалити фракцію, чудово");
                fractionHandler.removeFraction();
                break;
            case 3:
                System.out.println("Ви бажаєте побачити всі фракції, чудово");
                fractionHandler.showAllFractions();
                break;
            case 4:
                System.out.println("Яку саме фракцію ви хочете подивитись?");
                fractionHandler.showOneFraction();
                break;
            case 5:
                System.out.println("Сортувати депутатів фракціїї завіком");
                fractionHandler.sortFractions("віком", new CompareClass());
                break;
            case 6:
                System.out.println("Сортувати депутатів фракціїї іменем");
                fractionHandler.sortFractions("іменем", new CompareClass2());
                break;
        }
    }
    DeputyHandler deputyHandler = new DeputyHandler();
    public void switchDeputy() {
        MyScanner scanner = new MyScanner();
        scanner.writeNumber();
        scanner.getNumber();

        switch (scanner.getNumber()) {
            case 1:
                System.out.println("Ви бажаєте додати депутата до фракції, чудово");
                deputyHandler.addDeputyToFraction();
                break;
            case 2:
                System.out.println("Ви бажаєте видалити депутата з фракції, чудово");
                deputyHandler.removeDeputyFromFraction();
                break;
            case 3:
                System.out.println("Замінити депутата в фракції, чудово");
                fractionHandler.showAllFractions();
                break;
            case 4:
                System.out.println("Показати всіх хабарників у фракції?");
                deputyHandler.showAllBribeTakersInFraction("Habarnyk", new CompareBoolean());
                break;
            case 5:
                System.out.println("Видалити всіх хабарників з фракції?");
                deputyHandler.removeAllBribeTakersFromFraction("Habarnyk", new CompareBoolean());
                break;

        }
    }
}
