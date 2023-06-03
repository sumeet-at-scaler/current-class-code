package FairWork.Lect_Begin_CnG.DemoOnHashSet;

import java.util.HashSet;

public class Client {
    public static void main(String[] args) {
        HashSet<Point> set = new HashSet<>();
        set.add(new Point(1, 2));
        set.add(new Point(10, 20));
        set.add(new Point(100, 200));
        set.add(new Point(10, 20));
        System.out.println(set);

    }

    static class Point {
        int x;
        int y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "[x=" + this.x + ", y=" + this.y + "]";
        }

        @Override
        public boolean equals(Object obj) {
            Point other = (Point) obj;
            return this.x == other.x && this.y == other.y;
        }

        @Override
        public int hashCode() {
            return this.x + this.y;
        }
    }
}
