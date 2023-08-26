package strategies;

import models.Transaction;
import models.UserForPQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class GreedySettlement implements SettlementStrategy {

    @Override
    public List<Transaction> settleUp(Map<String, Integer> balanceSheet) {
        PriorityQueue<UserForPQ> pqLess = new PriorityQueue<>();
        PriorityQueue<UserForPQ> pqMore = new PriorityQueue<>();

        for(String user: balanceSheet.keySet()){
            if(balanceSheet.get(user) > 0){
                pqMore.add(new UserForPQ(user, balanceSheet.get(user)));
            } else {
                pqLess.add(new UserForPQ(user, -balanceSheet.get(user)));
            }
        }

        List<Transaction> res = new ArrayList<>();
        while(pqLess.size() > 0 && pqMore.size() > 0){
            UserForPQ fromUser = pqLess.remove();
            UserForPQ toUser = pqMore.remove();

            int amount = Math.min(fromUser.getBalance(), toUser.getBalance());
            Transaction t = new Transaction(fromUser.getName(), toUser.getName(), amount);
            res.add(t);

            fromUser.setBalance(fromUser.getBalance() - amount);
            toUser.setBalance(toUser.getBalance() - amount);

            if(fromUser.getBalance() > 0){
                pqLess.add(fromUser);
            }

            if(toUser.getBalance() > 0){
                pqMore.add(toUser);
            }
        }

        return  res;
    }
}
