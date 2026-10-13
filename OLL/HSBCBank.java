package OLL;

public class HSBCBank {
    int accountBal;

    public HSBCBank(int accountBal)
    {
        this.accountBal = accountBal;
    }

    synchronized public void deposit(int deposit)
    {
        accountBal = accountBal+deposit;
    }

    synchronized public void withdrawal(int withdraw)
    {
        accountBal = accountBal- withdraw;
    }

    synchronized public void balanceCheck()
    {
        System.out.println(accountBal);
    }
}
