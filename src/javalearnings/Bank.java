package javalearnings;


public class Bank {

    Integer Rupees;
    Integer Dollar;
    Integer CanadianDollar;
    static String Country;

    public Integer getRupees() {
        return Rupees;
    }

    public void setRupees(Integer rupees) {
        Rupees = rupees;
    }
    public void setDollar(Integer dollar){
        Dollar = dollar;
    }
    public Integer getDollar(){
        return Dollar;
    }
    public void setCanadianDollar(Integer canadianDollar){
        CanadianDollar = canadianDollar;
    }
    public Integer getCanadianDollar(){
        return CanadianDollar;
    }
    public String getCountry(){
        return Country;
    }

    public Bank(Integer rupees, Integer dollar, Integer canadianDollar) {
        Rupees = rupees;
        Dollar = dollar;
        CanadianDollar = canadianDollar;
    }

    public static void main(String[] args) {

        Bank sunakshi = new Bank(0,0,0);
        Bank priyank = new Bank(0,0,0);
        Bank.Country = "India";

        priyank.setCanadianDollar(50);
        sunakshi.setRupees(500);

        int current_balance= priyank.getRupees();
        int withdrawal_amount= 0;

        if (current_balance >= withdrawal_amount){
            priyank.setRupees(current_balance - withdrawal_amount);
        }
        else{
            System.out.println("You do noy have this much balance in your account");}


        System.out.println("Priyank current balance is: " + priyank.getRupees() +"INR " + priyank.getDollar() + "USD "
                            + priyank.getCanadianDollar() + "CND " + priyank.getCountry());
        System.out.println("Sunakshi  balance is: " + sunakshi.getRupees() +"INR " + sunakshi.getDollar() +"USD "
                            + sunakshi.getCanadianDollar() + "CND");

    }
}
