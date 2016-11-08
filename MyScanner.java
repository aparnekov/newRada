import java.util.Scanner;


public class MyScanner {
    private int number;
    private String name;
    private boolean bribeTaker;


    public void writeNumber() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            setNumber(scanner.nextInt());
        } else {
            System.out.println("Вкажіть цифру");
        }
    }

    public void writeString() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            setName(scanner.nextLine());
        } else {
            System.out.println("Напишіть слово");
        }
    }

    public void chooseBriber() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextBoolean()) {
            boolean b = scanner.nextBoolean();
            if (b == true) {
                setBribeTaker(true);
            }
            if (b == false) {
                setBribeTaker(false);
            }
        } else {
            System.out.println("Зробіть вибір!");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }
}