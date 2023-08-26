import models.ExpensePaidBy;
import models.ExpenseSharedBy;
import models.Transaction;
import strategies.GreedySettlement;
import strategies.RoundRobin;
import strategies.SettlementStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        // real input is group name
        // we will get the following two lists by navigating the following repo =>
        // group, groupExpense, Expense, ExpensePaidBy, ExpenseSharedBy
        List<ExpensePaidBy> paidBy = new ArrayList<>();
        paidBy.add(new ExpensePaidBy("A", 5000));
        paidBy.add(new ExpensePaidBy("B", 5000));
        paidBy.add(new ExpensePaidBy("A", 5000));
        paidBy.add(new ExpensePaidBy("B", 5000));
        paidBy.add(new ExpensePaidBy("C", 5000));

        List<ExpenseSharedBy> sharedBy = new ArrayList<>();
        sharedBy.add(new ExpenseSharedBy("A", 2000));
        sharedBy.add(new ExpenseSharedBy("B", 2000));
        sharedBy.add(new ExpenseSharedBy("C", 3000));
        sharedBy.add(new ExpenseSharedBy("D", 3000));
        sharedBy.add(new ExpenseSharedBy("A", 4000));
        sharedBy.add(new ExpenseSharedBy("B", 4000));
        sharedBy.add(new ExpenseSharedBy("C", 4000));
        sharedBy.add(new ExpenseSharedBy("D", 3000));

        settleUp(paidBy, sharedBy, new GreedySettlement());
    }

    public static void settleUp(List<ExpensePaidBy> paidBy, List<ExpenseSharedBy> sharedBy, SettlementStrategy settlementStrategy){
        // create balancesheet
        Map<String, Integer> balanceSheet = new HashMap<>();
        for(ExpensePaidBy payer: paidBy){
            if(balanceSheet.containsKey(payer.getName())){
                balanceSheet.put(payer.getName(), balanceSheet.get(payer.getName()) + payer.getContri());
            } else {
                balanceSheet.put(payer.getName(), payer.getContri());
            }
        }

        for(ExpenseSharedBy sharer: sharedBy){
            if(balanceSheet.containsKey(sharer.getName())){
                balanceSheet.put(sharer.getName(), balanceSheet.get(sharer.getName()) - sharer.getContri());
            } else {
                balanceSheet.put(sharer.getName(), -sharer.getContri());
            }
        }

        // invoke settlement algorithm
        List<Transaction> transactions = settlementStrategy.settleUp(balanceSheet);

        // print
        System.out.println(transactions);
    }
}
