package FairWork.Lecture3_Inter_OOPs.Demo4;

public class Rectangle {
    Point tl;
    Point br;

    Rectangle(int x1, int y1, int x2, int y2){
        this.tl = new Point(x1, y1);
        this.br = new Point(x2, y2);
    }

    void display(){
        System.out.println("-------------");
        this.tl.display();
        this.br.display();
        System.out.println("-------------");
    }

    Rectangle(Point p1, Point p2){
//        this.tl = p1;
//        this.br = p2;
        this.tl = new Point(p1);
        this.br = new Point(p2);
    }

    Rectangle(Rectangle r){
        this(r.tl, r.br);
    }
}
