package strategies;

import models.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoundRobin implements SettlementStrategy {

    @Override
    public List<Transaction> settleUp(Map<String, Integer> balanceSheet) {
        List<Transaction> res = new ArrayList<>();

        int n = balanceSheet.size();
        ArrayList<String> users = new ArrayList<>(balanceSheet.keySet());
        for(int i = 0; i <= n - 2; i++){
            String currUser = users.get(i);
            String currPlusOneUser = users.get(i + 1);

            int balanceCurrent = balanceSheet.get(currUser);
            int balanceCurrentPlusOne = balanceSheet.get(currPlusOneUser);

            Transaction t = null;
            if(balanceCurrent > 0){
                // paid more => now receive
                t = new Transaction(currPlusOneUser, currUser, balanceCurrent);
            } else if(balanceCurrent < 0){
                // paid less => now pay
                t = new Transaction(currUser, currPlusOneUser, -balanceCurrent);
            }

            balanceSheet.put(currUser, 0);
            balanceSheet.put(currPlusOneUser, balanceCurrentPlusOne + balanceCurrent);
            if(t != null) {
                res.add(t);
            }
        }

        return res;
    }
}
