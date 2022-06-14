
class AccountBalance {
    private double balance=10000;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Account extends AccountBalance {
    public void debit(double debitAmount){
        if (getBalance()>=debitAmount){
            double remainingAmount=getBalance()-debitAmount;
            setBalance(remainingAmount);
            System.out.println("The new balance is :"+getBalance());
        }else {
            System.out.println("Debit amount exceed account balance");
        }
    }

    public static void main(String[] args) {
        Account account=new Account();
        account.debit(1000);
    }
}
