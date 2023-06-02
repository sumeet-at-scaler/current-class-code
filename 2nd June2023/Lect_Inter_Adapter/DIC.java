package FairWork.Lect_Inter_Adapter;

import FairWork.Lect_Inter_Adapter.ICICI.ICICIBankAdapter;
import FairWork.Lect_Inter_Adapter.Yesbank.YesBankAdapter;

public class DIC {
    public static BankAPIForPhonePe getBankAPI(){
        // make a call to phone pe server, which will read from config, which adapter object to give
        return new YesBankAdapter(); // hard coding for example
    }
}
