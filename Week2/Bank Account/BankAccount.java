import java.util.*;


public class BankAccount {
    // class var
    private double CheckingAccount;
    private double SavingAccount;

    // these are static var
    public static int numofAccounts = 0;
    public static double Total = 0;
    
    // constructor 
    public BankAccount() {
        BankAccount.numofAccounts++;


    }
    // getter method for checking 
    public double getCheckingAccount() {
        return this.CheckingAccount;
    }
    // getter for savings 
    public double getSavingAccount(){
        return this.SavingAccount;
        
    }
    // deposit money 
    public void depositDaMoney(double CheckingAccount, double SavingAccount){
        this.CheckingAccount += CheckingAccount;
        this.SavingAccount += SavingAccount;
        BankAccount.Total += (CheckingAccount + SavingAccount);
        
    }
    public void WithdrawMoney(double WithdrawChecking, double WithdrawSaving){
        boolean FundsinChecking = false;
        boolean FundsinSaving = false;
        
        if (this.CheckingAccount >= WithdrawChecking){
            this.CheckingAccount -= WithdrawChecking;
            FundsinChecking = true;
            BankAccount.Total -= WithdrawChecking;
        }
        else{
            System.out.println("no money homie in your Checking Account. you are broke boi");
        }

        if (this.SavingAccount >= WithdrawSaving){
            this.SavingAccount -= WithdrawSaving;
            FundsinSaving = true;
            BankAccount.Total -= WithdrawSaving;
        }
        else{
            System.out.println("no money homie in your Savings Account. you are broke boi");
        }
    }
    public void disTotalAmount(){
        System.out.printf("$%.2f",BankAccount.Total);
    }
}
