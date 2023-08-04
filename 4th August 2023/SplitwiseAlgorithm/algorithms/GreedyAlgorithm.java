package FairWork.SplitwiseAlgorithm.algorithms;

import FairWork.SplitwiseAlgorithm.models.Transaction;
import FairWork.SplitwiseAlgorithm.models.UserForPQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class GreedyAlgorithm implements SettlementStrategy {


    @Override
    public List<Transaction> settleBalanceSheet(HashMap<String, Integer> balanceSheet) {
        List<Transaction> res = new ArrayList<>();

        PriorityQueue<UserForPQ> paidLess = new PriorityQueue<>();
        PriorityQueue<UserForPQ> paidMore = new PriorityQueue<>();
        for(String key: balanceSheet.keySet()){
            String user = key;
            int balance = balanceSheet.get(user);

            if(balance < 0){
                paidLess.add(new UserForPQ(user, -balance));
            } else if(balance > 0) {
                paidMore.add((new UserForPQ(user, balance)));
            }
        }

        while(paidLess.size() > 0 && paidMore.size() > 0){
            UserForPQ fromuser = paidLess.remove();
            UserForPQ touser = paidMore.remove();

            String from = fromuser.getName();
            String to = touser.getName();

            int fromAmount = fromuser.getAmount();
            int toAmount = touser.getAmount();
            int tranAmount = Math.min(fromAmount, toAmount);

            Transaction t = new Transaction(from, to, tranAmount);
            res.add(t);

            fromAmount -= tranAmount;
            toAmount -= tranAmount;

            if(fromAmount > 0){
                paidLess.add(new UserForPQ(from, fromAmount));
            }

            if(toAmount > 0){
                paidMore.add(new UserForPQ(to, toAmount));
            }
        }

        return res;
    }
}
