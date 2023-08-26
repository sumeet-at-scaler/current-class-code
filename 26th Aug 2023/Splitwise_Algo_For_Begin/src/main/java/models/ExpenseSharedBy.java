package models;

public class ExpenseSharedBy {
    private String name;
    private int contri;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContri() {
        return contri;
    }

    public void setContri(int contri) {
        this.contri = contri;
    }

    public ExpenseSharedBy(String name, int contri) {
        this.name = name;
        this.contri = contri;
    }
}
