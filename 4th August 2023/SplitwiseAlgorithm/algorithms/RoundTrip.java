package FairWork.SplitwiseAlgorithm.algorithms;

import FairWork.SplitwiseAlgorithm.models.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RoundTrip implements SettlementStrategy {

    @Override
    public List<Transaction> settleBalanceSheet(HashMap<String, Integer> balanceSheet) {
        List<Transaction> result = new ArrayList<>();

        ArrayList<String> users = new ArrayList<>(balanceSheet.keySet());
        for(int i = 0; i < users.size() - 1; i++){
            String currentUser = users.get(i);
            String nextUser = users.get(i + 1);

            int balanceCurrent = balanceSheet.get(currentUser);
            int balanceNext = balanceSheet.get(nextUser);

            Transaction t = null;
            if(balanceCurrent > 0){
                // current has paid more. Now next should pay to current
                int amount = balanceCurrent;
                t = new Transaction(nextUser, currentUser, amount);

                balanceCurrent -= amount;
                balanceNext += amount;

                balanceSheet.put(currentUser, balanceCurrent);
                balanceSheet.put(nextUser, balanceNext);
            } else {
                // current has paid less. Now current should pay to next
                int amount = -balanceCurrent;
                t = new Transaction(currentUser, nextUser, amount);

                balanceCurrent += amount;
                balanceNext -= amount;

                balanceSheet.put(currentUser, balanceCurrent);
                balanceSheet.put(nextUser, balanceNext);
            }

            result.add(t);
        }

        return result;
    }
}
