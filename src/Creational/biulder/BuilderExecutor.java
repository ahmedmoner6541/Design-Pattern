package Creational.biulder;

public class BuilderExecutor {

    public static void main(String[] args) {
        Player player = new PlayerBuilder()
                .setName("Aziz")
                .setHeight(5)
                .setPhone("4854534")
                .setTeam("my team ")
                .setTwitterAccount("the twitter").getplayer();

        System.out.println(player.toString());


    }
}

