package data_struture;

public class QueueArray implements StackQueue{
    
    private int[] array;
    private int head;
    private int tail;
    private int SIZE;
    
    QueueArray (int item){
        SIZE = item;
        array = new int[item];
        head = tail = -1;

    }
    @Override
    public int pop() {
        int item = -1;
        if (!isEmpty()){
            item =array[head];
            head++;
            if (head > tail){
                head = tail = -1;
                System.out.println(head);
            }
        }
        return item;
    }

    @Override
    public boolean push(int item) {
        if (!isFull()){
            if (isEmpty()){
                head++;
            }
            tail++;
            array[tail] = item;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (head == -1) && (tail == -1);
    }

    @Override
    public boolean isFull() {
        return tail == SIZE-1 ;
    }
    public int count(){
        if (isEmpty())
            return 0;
        return tail - head + 1;
    }
    @Override
    public void show() {
        if (isEmpty()){
            System.out.println("queue is empty");
        }else {
            for (int i= head; i<=tail; i++){
                System.out.print(array[i]);
            }
            System.out.println();
        }

    }
}
