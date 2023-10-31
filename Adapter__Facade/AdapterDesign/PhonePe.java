package Adapter__Facade.AdapterDesign;

import Adapter__Facade.AdapterDesign.Adapters.BankApi;
import Adapter__Facade.AdapterDesign.Adapters.YesBankApiAdapter;

public class PhonePe {
    public static void main(String[] args) {
        BankApi yesBankAdapter = new YesBankApiAdapter();
        yesBankAdapter.addBankAccount();
        System.out.println("Account Balance: " + yesBankAdapter.checkBalance());
        yesBankAdapter.pay();
    }
}
