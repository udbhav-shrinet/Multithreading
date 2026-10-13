package OLL;
class HSBCBank {
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

class ATM extends Thread {
    private HSBCBank bank;
    
    public ATM(HSBCBank bank)
    {
        this.bank = bank;
    }

    public void run()
    {
        System.out.println("withdrawal");
        bank.withdrawal(2000);
    }
}

class GooglePay extends Thread{
    private HSBCBank bank;
    
    public GooglePay(HSBCBank bank)
    {
        this.bank = bank;
    }

    public void run()
    {
        System.out.println("deposit");
        bank.deposit(4000);
    }
}
 

class PhonePay extends Thread {
     private HSBCBank bank;
    
    public PhonePay(HSBCBank bank)
    {
        this.bank = bank;
    }

    public void run()
    {
        System.out.println("balancecheck");
        bank.balanceCheck();
    }
}

public class LaunchBank {
    public static void main(String[] args) {
        HSBCBank bank1 = new HSBCBank(4000);

        GooglePay gpay = new GooglePay(bank1);
        PhonePay phonepe = new PhonePay(bank1);
        ATM atm = new ATM(bank1);

        gpay.setName("GOOGLEPAY");
        phonepe.setName("PHONEPAY");
        atm.setName("ATM");

        gpay.start();
        phonepe.start();
        atm.start();

    }
}
