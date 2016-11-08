
public class Human {
    private int age;     // - оголошення змінних, їхні імена (доступ - завжди приватний)
    private int height;
    private int weight;

    Human(int age, int height, int weight) {  // - конструктор з параметрами
        this.age = age;
        this.height = height;
        this.weight = weight;  // - ініціалізація полів
    }

    public int getAge() {    // - геттер
        return age;
    }

    public void setAge(int age) {// - сеттер
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
