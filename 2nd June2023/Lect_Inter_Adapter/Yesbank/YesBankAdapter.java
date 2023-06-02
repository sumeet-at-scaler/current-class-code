package FairWork.Lect_Inter_Adapter.Yesbank;

import FairWork.Lect_Inter_Adapter.BankAPIForPhonePe;

public class YesBankAdapter implements BankAPIForPhonePe {
    YesBank_Remote yb = new YesBank_Remote();

    @Override
    public int checkBal(int ano) {
        return yb.getBal(ano);
    }

    @Override
    public void addMoney(int ano, int money) {
        yb.addMoney(ano, money);
    }

    @Override
    public void subMoney(int ano, int money) {
        yb.subMoeny(ano, money);
    }
}
