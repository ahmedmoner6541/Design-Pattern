package Creational.siglton;

public class SingltonExecutor {
    public static void main(String[] args) {

        Singlton singlton = Singlton.getInstance();
        Singlton singlton2 = Singlton.getInstance();
        Singlton singlton3 = Singlton.getInstance();

        System.out.println(singlton.hashCode());
        System.out.println(singlton2.hashCode());
        System.out.println(singlton3.hashCode());




    }
}
