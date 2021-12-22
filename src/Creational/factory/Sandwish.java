package Creational.factory;

public class Sandwish {
    String name;
    int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void prepare() {
        System.out.println("the " + name + " Sandwish is containt " + calories + " calories");
    }
}
