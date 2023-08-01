package FairWork.Lect_Begin_ParkingLot.models;

public class Operator extends BaseModel  {
    private String name;
    private String userName;
    private String pwd;
    // may have shift start and shift end information


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
