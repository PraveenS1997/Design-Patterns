package Adapter__Facade.AdapterDesign.Adapters;

import Adapter__Facade.AdapterDesign.ThirdPartyLibraries.IYesBankApi;
import Adapter__Facade.AdapterDesign.ThirdPartyLibraries.YesBankApi;

public class YesBankApiAdapter implements BankApi {
    private final IYesBankApi yesBankService = new YesBankApi();
    @Override
    public double checkBalance() {
        return yesBankService.checkBalance();
    }

    @Override
    public void addBankAccount() {
        boolean accountAdded = yesBankService.addBankAccount();
        if(!accountAdded){
            throw new RuntimeException();
        }
    }

    @Override
    public boolean pay() {
        yesBankService.pay();
        return true;
    }
}
