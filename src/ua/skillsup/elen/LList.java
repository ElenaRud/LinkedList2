package ua.skillsup.elen;

import java.net.BindException;

public class LList {
    private int LastIndex = -1;
    private Node root = new Node(LastIndex, null);
    private Node lastElem = root;

    public void add(Object o){
        Node current = new Node(++lastIndex, o);
    }
    public Object get(int i) {
        Node current = root.getNext();
        while current != null) {
            System.out.println("Elem:" + current.getIndex());
        if(current.getIndex() == i) {
            return current.getContent();
        current = current getNext()};
    }
    return null;
    }
    private class Node {
        private Node next;
        private int index;

        public int getIndex(return index;)
        public void setIndex(int index) {
            this.index = index;
        }
        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }