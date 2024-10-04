package src;
public class App {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Maria");
        account1.deposit(1000);
        account1.withdraw(500);
        for (int i= 0; i < account1.getTransactions().size(); i++) {
            System.out.printf("%d. %s\n", i+1, account1.getTransactions().get(i));
        }
        System.out.println(account1.getAccountNum());
        System.out.println();


        BankAccount account2 = new BankAccount("Peter", 2000);
        account2.withdraw(400);
        account2.deposit(900);
        for (int i= 0; i < account2.getTransactions().size(); i++) {
            System.out.printf("%d. %s\n", i+1, account1.getTransactions().get(i));
        }
        System.out.println(account2.getAccountNum());
        System.out.println();


        FixedDepositAccount FDaccount1 = new FixedDepositAccount("Lily", 368400f);
        FDaccount1.deposit(200);
        FDaccount1.withdraw(400);
        System.out.println(FDaccount1.getBalance());
        System.out.println(FDaccount1.getAccountNum());
        System.out.println();


        FixedDepositAccount FDaccount2 = new FixedDepositAccount("Andy", 234235230, 9);
        FDaccount2.deposit(200);
        FDaccount2.withdraw(400);
        System.out.println(FDaccount2.getBalance());
        System.out.println(FDaccount2.getAccountNum());
        System.out.println();

        FixedDepositAccount FDaccount3 = new FixedDepositAccount("Andy", 234235230, 9, 12);
        FDaccount3.deposit(200);
        FDaccount3.withdraw(400);
        System.out.println(FDaccount3.getBalance());
        System.out.println(FDaccount3.getAccountNum());
        System.out.println();

    }
    
}
