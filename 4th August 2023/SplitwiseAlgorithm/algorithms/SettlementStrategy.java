package FairWork.SplitwiseAlgorithm.algorithms;

import FairWork.SplitwiseAlgorithm.models.Transaction;

import java.util.HashMap;
import java.util.List;

public interface SettlementStrategy {
    List<Transaction> settleBalanceSheet(HashMap<String, Integer> balanceSheet);
}
