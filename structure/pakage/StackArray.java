package structure.pakage;

import sun.invoke.empty.Empty;

public class StackArray implements StackQueue {
    private int[] array;
    private int SIZE;
    private int top;

     StackArray(int item) {
        array = new int[item];
        SIZE = item;
        top = -1;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            int item = array[top];
            top--;
            return item;
        }
        return -1;
    }

    @Override
    public boolean push(int item) {
        if (!isFull()) {
            top++;
            array[top] = item;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return top < 0;
    }

    @Override
    public boolean isFull() {
        return top == SIZE - 1;
    }

    @Override
    public void show() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }

}
