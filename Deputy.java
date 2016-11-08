
public class Deputy extends Human {
    private String firstName;
    private String lastName;
    private boolean bribeTaker;


    Deputy(int age, int height, int weight, String firstName, String lastName, boolean bribeTaker) {
        super(age, height, weight);
        this.firstName = firstName;
        this.lastName = lastName;
        this.bribeTaker = bribeTaker;
    }

    public String toString(){
        return "Ім'я - " + getFirstName()+ ", "+ "Прізвище - "  + getLastName()+ ", " +
                "Вік - " + getAge()+ ", " + "Ріст - " + getHeight()+ ", "+ "Маса тіла - " + getWeight()+ ",  " +
                "Хабарник -  " + getBribeTaker()+";   \n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean getBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }
}
