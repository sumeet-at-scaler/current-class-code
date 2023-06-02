package FairWork.Lect_Inter_Adapter;

public class PhonePe {
    BankAPIForPhonePe ob = DIC.getBankAPI();

    int checkBalance(){
        return ob.checkBal(100);
    }

    void depMoney(){
        ob.addMoney(100, 200);
    }

    void withdrawMoney(){
        ob.subMoney(100, 200);
    }

    public static void main(String[] args) {
        PhonePe obj = new PhonePe();
        obj.checkBalance();
    }


}
