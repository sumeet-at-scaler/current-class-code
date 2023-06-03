package FairWork.Lect_Begin_CnG.DemoOnIterables;

import java.util.Iterator;

public class Node implements Iterable<Integer> {
     private int data;
     private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new NodeIterator(this);
    }

    public static class NodeIterator implements Iterator<Integer> {
        private Node temp;
        public NodeIterator(Node node){
            temp = node;
        }

        @Override
        public boolean hasNext() { // can we move it?
            if(temp == null){
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Integer next() { // returns current value and moves it
            Integer rval = temp.data;
            temp = temp.next;
            return rval;
        }
    }
}
