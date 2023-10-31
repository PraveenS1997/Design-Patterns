package Adapter__Facade.Adapter;

import Adapter__Facade.Adapter.Adapters.BankApi;
import Adapter__Facade.Adapter.Adapters.YesBankApiAdapter;

public class PhonePe {
    public static void main(String[] args) {
        BankApi yesBankAdapter = new YesBankApiAdapter();
        yesBankAdapter.addBankAccount();
        System.out.println("Account Balance: " + yesBankAdapter.checkBalance());
        yesBankAdapter.pay();
    }
}
