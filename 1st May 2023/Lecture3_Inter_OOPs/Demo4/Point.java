package FairWork.Lecture3_Inter_OOPs.Demo4;

public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(Point p){
        this(p.x, p.y);
    }


    void display(){
        System.out.println("[" + x + ", " + y + "]");
    }

}
