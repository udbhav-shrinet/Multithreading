package OLL;

public class ATM extends Thread {
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
