package OLL;

public class PhonePay extends Thread {
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
