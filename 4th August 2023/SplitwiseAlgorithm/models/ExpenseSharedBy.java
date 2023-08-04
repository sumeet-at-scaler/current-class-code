package FairWork.SplitwiseAlgorithm.models;

public class ExpenseSharedBy {
    String name;
    int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ExpenseSharedBy(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
}
