package AdapterAndFacade.AdapterDesign.ThirdPartyLibraries;

public interface IYesBankApi {
    double checkBalance();
    boolean addBankAccount();
    void pay();
}
