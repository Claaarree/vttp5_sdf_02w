package src;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankAccount{
    private final String accountName;
    private final String accountNum;
    private float accountBal;
    private List<String> transactions = new ArrayList<>();
    private boolean accountClosure;
    private LocalDateTime accountCreation;
    private LocalDateTime accountDeletion;
    public DateTimeFormatter formattedDate =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    public BankAccount(String accountName) {
        this.accountName = accountName;
        this.accountBal = 0.0f;
        int max = 999999999;
        int min = 1;
        int range = max - min + 1;
        //Account number generator
        this.accountNum = String.valueOf(Math.random() * range + 1);
        //Account creation date time
        this.accountCreation= LocalDateTime.now();
        this.accountClosure = false;
        
        
        
        System.out.printf("Hello %s, welcome to your new account!\n", this.accountName);
        System.out.println("Account created on: " + this.accountCreation.format(formattedDate));
        System.out.println("Your new account number is: " + this.accountNum);
        System.out.println("Your initial balance is $" + this.accountBal);


    }
    
    public BankAccount(String accountName, float accountBal) {
        this.accountName = accountName;
        this.accountBal = accountBal;
        int max = 999999999;
        int min = 1;
        int range = max - min + 1;
        //Account number generator
        this.accountNum = String.valueOf(Math.random() * range + 1);
        //Account creation date time
        this.accountCreation= LocalDateTime.now();
        this.accountClosure = false;
        
        
        System.out.printf("Hello %s, welcome to your new account!\n", this.accountName);
        System.out.println("Account created on: " + this.accountCreation.format(formattedDate));
        System.out.println("Your new account number is: " + this.accountNum);
        System.out.println("Your initial balance is $" + this.accountBal);


    
    }


    public void deposit(float depositAmount) {
        if (depositAmount > 0 && !accountClosure) {
            this.accountBal += depositAmount;
            System.out.println("$" + depositAmount + " deposited on " + LocalDateTime.now().format(formattedDate));
            System.out.println("Your new account balance is $" + this.accountBal);
            transactions.add("$" + depositAmount + "deposited on " + LocalDateTime.now().format(formattedDate));
        } else if (depositAmount < 0 || accountClosure) {
            throw new IllegalArgumentException("Unable to deposit. The amount may be wrong or your account may be closed.");
        } else System.out.println("Unable to process, please try again.");
    }

    public void withdraw(float withdrawAmount) {
        if (withdrawAmount > 0 && !accountClosure) {
            if (withdrawAmount <= this.accountBal) {
            this.accountBal -= withdrawAmount;
            System.out.println("$" + withdrawAmount + " withdrew on " + LocalDateTime.now().format(formattedDate));
            System.out.println("Your new account balance is $" + this.accountBal);
            transactions.add("$" + withdrawAmount + "deposited on " + LocalDateTime.now().format(formattedDate));
            } else System.out.println("Insufficient account balance to withdraw. Please try again.");
        } else if (withdrawAmount < 0 || accountClosure) {
            throw new IllegalArgumentException("Unable to withdraw. The amount may be wrong or your account may be closed.");
        } else System.out.println("Unable to process, please try again.");
    }

    

    @Override
    public String toString() {
        return "BankAccount [accountName=" + accountName + ", accountNum=" + accountNum + ", accountBal=" + accountBal
                + ", transactions=" + transactions + ", accountClosure=" + accountClosure + ", accountCreation="
                + accountCreation + ", accountDeletion=" + accountDeletion + ", formattedDate=" + formattedDate + "]";
    }

    public String getAccountName() {
        return accountName;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public float getAccountBal() {
        return accountBal;
    }
    public void setAccountBal(float accountBal) {
        this.accountBal = accountBal;
    }
    public List<String> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
    public boolean isAccountClosure() {
        return accountClosure;
    }
    public void setAccountClosure(boolean accountClosure) {
        this.accountClosure = accountClosure;
    }
    public LocalDateTime getAccountCreation() {
        return accountCreation;
    }
    public void setAccountCreation(LocalDateTime accountCreation) {
        this.accountCreation = accountCreation;
    }
    public LocalDateTime getAccountDeletion() {
        return accountDeletion;
    }
    public void setAccountDeletion(LocalDateTime accountDeletion) {
        this.accountDeletion = accountDeletion;
    }

    

}