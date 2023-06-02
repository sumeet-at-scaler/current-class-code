package FairWork.Lect_Inter_Adapter.ICICI;

import FairWork.Lect_Inter_Adapter.BankAPIForPhonePe;
import FairWork.Lect_Inter_Adapter.Yesbank.YesBank_Remote;

public class ICICIBankAdapter implements BankAPIForPhonePe {
    ICICIBank_Remote ib = new ICICIBank_Remote();

    @Override
    public int checkBal(int ano) {
        return ib.whatIsBal(ano);
    }

    @Override
    public void addMoney(int ano, int money) {
        ib.putMoney(ano, money);
    }

    @Override
    public void subMoney(int ano, int money) {
        ib.removeMoeny(ano, money);
    }
}
