package OLL;

public class GooglePay extends Thread{
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
