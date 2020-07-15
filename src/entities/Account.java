package entities;

public class Account {

    private String holder;
    private int number;
    private double balance;


    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }


    public Account(String holder, int number, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        depositValue(initialDeposit);
    }


    public String getName() {
        return holder;
    }

    public void setName(String name) {
        this.holder = name;
    }

    public int getNumber() {
        return number;
    }


    public double getValue() {
        return balance;
    }

    public void depositValue(double amount){
        this.balance += amount;
    }

    public void withdrawValue(double amount){
        this.balance -= amount + 5.0;
    }

    public String toString(){
        return "Account: "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f, ", balance);
    }



}
