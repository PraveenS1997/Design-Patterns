package Adapter__Facade.AdapterDesign.ThirdPartyLibraries;

public class YesBankApi implements IYesBankApi{
    @Override
    public double checkBalance() {
        System.out.println("Fetching balance");
        return 90.32;
    }

    @Override
    public boolean addBankAccount() {
        System.out.println("Adding yes bank account");
        return true;
    }

    @Override
    public void pay() {
        System.out.println("Payment paid successfully");
    }
}
