package Ushtrimi4;

public class BankAccount {
    private int accountNo;
    private double amount;
    public BankAccount(){
        this.accountNo = 0;
        this.amount = 0;
    }
    public BankAccount(int nr, double am){
        this.accountNo = nr;
        this.amount = am;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public void setAccountNo(int nr){
        this.accountNo = nr;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(double am){
        this.amount = am;
    }
}
