package FairWork.Lecture_Inter_SOLID2.LSP_Violation_Demo;

public class Square extends Rectangle {
    void setHeight(int ht){
        height = ht;
        width = ht;
    }

    void setWidth(int w){
        width = w;
        height = w;
    }
}
