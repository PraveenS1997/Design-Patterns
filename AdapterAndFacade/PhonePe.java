package AdapterAndFacade;

import AdapterAndFacade.Adapter.BankApi;
import AdapterAndFacade.Adapter.YesBankApiAdapter;

public class PhonePe {
    public static void main(String[] args) {
        BankApi yesBankAdapter = new YesBankApiAdapter();
        yesBankAdapter.addBankAccount();
        System.out.println("Account Balance: " + yesBankAdapter.checkBalance());
        yesBankAdapter.pay();
    }
}
