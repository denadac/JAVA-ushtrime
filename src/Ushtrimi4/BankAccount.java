package Ushtrimi4;

import java.util.ArrayList;

public class BankAccount implements Measurable{
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
    public double getMeasure(){
        ArrayList<BankAccount> accList = new ArrayList<BankAccount>();
        double sum = 0;
        for (int i= 0; i< accList.size(); i++){
            sum += accList.get(i).getAmount();

        }
        return sum / accList.size();

    }
}
