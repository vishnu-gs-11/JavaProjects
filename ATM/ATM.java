package Java.IDE.ATM;

public class ATM {
    private double balance;
    private double depositCash;
    private double withdrawCash;

    // public ATM() {

    // }

    // set and get Balance

    public void setBalance (double balance) {
        this.balance = balance;
    } 

    public double getBalance() {
        return balance;
    }

    // set and get deposit

    public void setDepositCash(double depositCash) {
        this.depositCash = depositCash;
    }
    

    public double getDepositCash() {
        return depositCash;
    }

    // set and get withdraw

    public void setWithdrawCash(double withdrawCash) {
        this.withdrawCash = withdrawCash;
    }

    public double getWithdrawCash() {
        return withdrawCash;
    }
}
