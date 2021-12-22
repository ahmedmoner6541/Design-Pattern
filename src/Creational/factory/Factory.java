package Creational.factory;

public class Factory {
    public static final int CHEES = 1;
    public static final int BEEF = 2;
    public static final int CHIKEN = 3;

    public static Sandwish createSandwish(int sandwishId) {
        switch (sandwishId) {
            case CHEES:
                return new CheesSandwish();
            case BEEF:
                return new BeefSanwish();
            case CHIKEN:
                  new ChickenSandwish();

            default:
                return null;

        }
    }
}
