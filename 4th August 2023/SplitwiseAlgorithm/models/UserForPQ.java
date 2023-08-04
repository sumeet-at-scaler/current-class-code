package FairWork.SplitwiseAlgorithm.models;

public class UserForPQ implements Comparable<UserForPQ> {
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

    public UserForPQ(String name, int amount){
        this.name = name;
        this.amount = amount;
    }

    @Override
    public int compareTo(UserForPQ o) {
        return o.amount - this.amount;
    }
}
