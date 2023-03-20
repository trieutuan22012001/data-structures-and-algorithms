package algorithm.pakage;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
//        BubbleSort sorting = new BubbleSort(10);
//        System.out.println("Before sorting:");
//        sorting.prints();
//        sorting.bubblesort();
//        System.out.println("After sorting:");
//        sorting.prints();

        int[] arr = QuickSort.generate(10,0,10);
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        QuickSort.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }
}
