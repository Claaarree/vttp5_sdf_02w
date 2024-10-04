package src;

public class FixedDepositAccount extends BankAccount {

    final float interest;
    final Integer durationInMonths;
    
    
    public FixedDepositAccount(String accountName, float accountBal) {
        super(accountName, accountBal);
        this.interest = 3;
        this.durationInMonths = 6;
    }

    public FixedDepositAccount(String accountName, float accountBal, float interest) {
        super(accountName, accountBal);
        this.interest = interest;
        this.durationInMonths = 6;
    }

    public FixedDepositAccount(String accountName, float accountBal, float interest, Integer durationInMonths) {
        super(accountName, accountBal);
        this.interest = interest;
        this.durationInMonths = durationInMonths;
    }

    public float getBalance() {
        float fixedDepositBalance = this.getAccountBal() + this.interest;
        return fixedDepositBalance;
    }


    @Override
    public void deposit(float depositAmount) {
        System.out.println("Account balance is fixed! Unable to deposit.");

    }

    @Override
    public void withdraw(float withdrawAmount) {
        System.out.println("Account balance is fixed! Unable to withdraw.");
    }

    public float getInterest() {
        return interest;
    }

    public Integer getDurationInMonths() {
        return durationInMonths;
    }


    
    
    
}
