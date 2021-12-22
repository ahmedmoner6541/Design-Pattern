package Creational.factory;

public class FactoryExecutor {
    public static void main(String[] args) {
        Sandwish sandwish = Factory.createSandwish(Factory.CHEES);
        sandwish.prepare();
    }
}
