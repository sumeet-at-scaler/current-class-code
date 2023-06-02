package FairWork.Lect_Inter_Adapter.Yesbank;

public class YesBank_Remote {
    int getBal(int ano){
        // will make calls to YesBank API (Restful)
        System.out.println("Makes call to yes bank api for checking balance");
        return 0;
    }

    void addMoney(int ano, int money){
        System.out.println("Makes call to yes bank api for depositing money");
    }

    void subMoeny(int ano, int money){
        System.out.println("Makes call to yes bank api for withdrawing money");
    }
}
