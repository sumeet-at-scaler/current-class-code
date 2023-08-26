package strategies;

import models.Transaction;

import java.util.List;
import java.util.Map;

public interface SettlementStrategy {
    List<Transaction> settleUp(Map<String, Integer> balanceSheet);
}
