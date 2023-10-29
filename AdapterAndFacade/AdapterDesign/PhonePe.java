package AdapterAndFacade.AdapterDesign;

import AdapterAndFacade.AdapterDesign.Adapters.BankApi;
import AdapterAndFacade.AdapterDesign.Adapters.YesBankApiAdapter;

public class PhonePe {
    public static void main(String[] args) {
        BankApi yesBankAdapter = new YesBankApiAdapter();
        yesBankAdapter.addBankAccount();
        System.out.println("Account Balance: " + yesBankAdapter.checkBalance());
        yesBankAdapter.pay();
    }
}
