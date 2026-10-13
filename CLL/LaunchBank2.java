package CLL;
class HSBCBank {
    static int accountBal = 4000;

    synchronized public static void deposit(int deposit)
    {
        accountBal = accountBal+deposit;
    }

    synchronized public static void withdrawal(int withdraw)
    {
        accountBal = accountBal- withdraw;
    }

    synchronized public static void balanceCheck()
    {
        System.out.println(accountBal);
    }
}

class ATM extends Thread {
    

    public void run()
    {
        System.out.println("withdrawal");
        HSBCBank.withdrawal(2000);
    }
}

class GooglePay extends Thread{
    

    public void run()
    {
        System.out.println("deposit");
        HSBCBank.deposit(4000);
    }
}
 

class PhonePay extends Thread {

    public void run()
    {
        System.out.println("balancecheck");
        HSBCBank.balanceCheck();
    }
}

public class LaunchBank2 {
    public static void main(String[] args) {
        

        GooglePay gpay = new GooglePay();
        PhonePay phonepe = new PhonePay();
        ATM atm = new ATM();

        gpay.setName("GOOGLEPAY");
        phonepe.setName("PHONEPAY");
        atm.setName("ATM");

        gpay.start();
        phonepe.start();
        atm.start();

    }
}
