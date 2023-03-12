package data_struture;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
    private Node first;
    private Node last;

//    implement addLast method
    public void addLast(int item){
        Node node = new Node(item);
        System.out.println();
        if (first == null)
            first = last = node;
        else{
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int item){
        Node node = new Node(item);
        if (first == null)
            first = last = node;
        else{
            first.next = node;
            first = node;
        }
    }

    }


