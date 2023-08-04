package FairWork.SplitwiseAlgorithm;

import FairWork.SplitwiseAlgorithm.algorithms.GreedyAlgorithm;
import FairWork.SplitwiseAlgorithm.algorithms.RoundTrip;
import FairWork.SplitwiseAlgorithm.algorithms.SettlementStrategy;
import FairWork.SplitwiseAlgorithm.models.ExpensePaidBy;
import FairWork.SplitwiseAlgorithm.models.ExpenseSharedBy;
import FairWork.SplitwiseAlgorithm.models.Transaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<ExpensePaidBy> paidByList = new ArrayList<>();
        paidByList.add(new ExpensePaidBy("A", 4000));
        paidByList.add(new ExpensePaidBy("B", 2000));
        paidByList.add(new ExpensePaidBy("C", 6000));

        List<ExpenseSharedBy> sharedByList = new ArrayList<>();
        sharedByList.add(new ExpenseSharedBy("A", 1000));
        sharedByList.add(new ExpenseSharedBy("B", 1000));
        sharedByList.add(new ExpenseSharedBy("C", 1000));
        sharedByList.add(new ExpenseSharedBy("D", 1000));
        sharedByList.add(new ExpenseSharedBy("A", 1000));
        sharedByList.add(new ExpenseSharedBy("B", 1000));
        sharedByList.add(new ExpenseSharedBy("C", 3000));
        sharedByList.add(new ExpenseSharedBy("D", 3000));

        // get data => prepare lists of paidby and shared by
        List<Transaction> transactions = settleExpenses(paidByList, sharedByList, new GreedyAlgorithm());
        System.out.println(transactions);
    }

    static List<Transaction> settleExpenses(List<ExpensePaidBy> paidByList,
                                            List<ExpenseSharedBy> sharedByList,
                                            SettlementStrategy settlementStrategy){

        // create balancesheet
        HashMap<String, Integer> balanceSheet = new HashMap<>();
        for(ExpensePaidBy payer: paidByList){
            String name = payer.getName();
            int amount = payer.getAmount();

            if(balanceSheet.containsKey(name)){
                balanceSheet.put(name, balanceSheet.get(name) + amount);
            } else {
                balanceSheet.put(name, +amount);
            }
        }

        for(ExpenseSharedBy sharedBy: sharedByList){
            String name = sharedBy.getName();
            int amount = sharedBy.getAmount();

            if(balanceSheet.containsKey(name)){
                balanceSheet.put(name, balanceSheet.get(name) - amount);
            } else {
                balanceSheet.put(name, -amount);
            }
        }

        // settle via greedy or roundtrip algorithm
        List<Transaction> res = settlementStrategy.settleBalanceSheet(balanceSheet);
        return res;
    }
}
