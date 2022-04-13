import java.util.*;


public class TestAccount {
    public static void main(String[] args) {
        BankAccount appTest = new BankAccount();

        appTest.depositDaMoney(20000,30000);
        System.out.println(appTest.getCheckingAccount());
        System.out.println(appTest.getSavingAccount());
        System.out.printf("$%.2f\n",BankAccount.Total);


        appTest.WithdrawMoney(10000,10000);
        System.out.println(appTest.getCheckingAccount());
        System.out.println(appTest.getSavingAccount());

        
        System.out.printf("$%.2f\n",BankAccount.Total);


    }
}