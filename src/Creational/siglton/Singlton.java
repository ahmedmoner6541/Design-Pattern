package Creational.siglton;

/*
 Disadvantages
    1 - thread save
    بسبب وصول اكتر من thread في نفس الوقت  للاوبجكت يعمل اختلاف في الاوبجكت
    -الحل
    syncronayzed block

*/
public class Singlton {
    private static Singlton instance;

    private Singlton() {
    }

    public static Singlton getInstance() {
        synchronized (Singlton.class) {
            if (instance == null) {
                instance = new Singlton();
            }
        }

        return instance;
    }
}
