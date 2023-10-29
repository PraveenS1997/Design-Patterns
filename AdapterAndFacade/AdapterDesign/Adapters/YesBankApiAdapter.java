package AdapterAndFacade.AdapterDesign.Adapters;

import AdapterAndFacade.AdapterDesign.ThirdPartyLibraries.IYesBankApi;
import AdapterAndFacade.AdapterDesign.ThirdPartyLibraries.YesBankApi;

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
