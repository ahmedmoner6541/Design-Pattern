package Creational.biulder;

public class PlayerBuilder {
    private String name;
    private String team;
    private double height;
    private int salary;
    private String phone;
    private String twitterAccount;

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PlayerBuilder setTeam(String team) {
        this.team = team;
        return this;
    }

    public PlayerBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public PlayerBuilder setSalary(int salary) {
        this.salary = salary;
        return this;
    }

    public PlayerBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public PlayerBuilder setTwitterAccount(String twitterAccount) {
        this.twitterAccount = twitterAccount;

        return this;
    }
    public Player getplayer(){
        return new Player(name,team,height,salary,phone,twitterAccount);
    }
//
//    public PlayerBuilder twitterAccount(String twitterAccount) {
//        this.twitterAccount = twitterAccount;
//        return this ;
//    }
//
//    public Player build(){
//        return new Player();
//    }


}
