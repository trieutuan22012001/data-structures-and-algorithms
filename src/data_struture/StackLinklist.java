package data_struture;

import jdk.nashorn.internal.ir.CallNode;

public class StackLinklist implements StackQueue{
    private class Node{
        int item;
        Node next;
        Node (int item){
            this.item = item;
        }
    }
    Node topnode;

    StackLinklist (){
        topnode = null;
    }
    @Override
    public int pop() {
        if(isEmpty())
            return -1;
        int value = topnode.item;
        topnode = topnode.next;
        return value;
    }

    @Override
    public boolean push(int item) {
        if (!isFull()){
            Node value = new Node(item);
            value.next = topnode;
            topnode = value;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return topnode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("stack is full");
            return;
        }
        Node temp = topnode;
        while (temp!=null){
            System.out.println(temp.item + "");
            temp = temp.next;
        }
    }
}
