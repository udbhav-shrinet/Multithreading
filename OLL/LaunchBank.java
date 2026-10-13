package OLL;
import OLL.*;


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
