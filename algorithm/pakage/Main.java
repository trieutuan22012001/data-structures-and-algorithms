package algorithm.pakage;

public class Main {
    public static void main(String[] args){
        BubbleSort sorting = new BubbleSort(10);
        System.out.println("Before sorting:");
        sorting.prints();
        sorting.bubblesort();
        System.out.println("After sorting:");
        sorting.prints();
    }
}
