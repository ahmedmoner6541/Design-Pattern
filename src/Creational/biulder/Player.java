package Creational.biulder;

public class Player {

    private String name ;
    private String team ;
    private double height ;
    private int salary ;
    private String phone ;
    private String twitterAccount ;

    public Player(String name, String team, double height, int salary, String phone, String twitterAccount) {
        this.name = name;
        this.team = team;
        this.height = height;
        this.salary = salary;
        this.phone = phone;
        this.twitterAccount = twitterAccount;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public double getHeight() {
        return height;
    }

    public int getSalary() {
        return salary;
    }

    public String getPhone() {
        return phone;
    }

    public String getTwitterAccount() {
        return twitterAccount;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", height=" + height +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", twitterAccount='" + twitterAccount + '\'' +
                '}';
    }




}