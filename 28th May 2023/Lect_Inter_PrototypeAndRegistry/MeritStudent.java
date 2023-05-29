package FairWork.Lect_Inter_PrototypeAndRegistry;

public class MeritStudent extends Student {
    private int scholarship;

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public MeritStudent(){

    }

    public MeritStudent(MeritStudent orig){
        super(orig);
        this.scholarship = orig.scholarship;
    }

    public MeritStudent clone(){
        return new MeritStudent(this);
    }
}
