package FairWork.Lect_Inter_Adapter.ICICI;

public class ICICIBank_Remote {
    int whatIsBal(int ano){
        // will make calls to ICICI API (Restful)
        System.out.println("Makes call to icici bank api for checking balance");
        return 0;
    }

    void putMoney(int ano, int money){
        System.out.println("Makes call to icici bank api for depositing money");
    }

    void removeMoeny(int ano, int money){
        System.out.println("Makes call to icici bank api for withdrawing money");
    }
}
