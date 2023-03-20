package algorithm.pakage;

import java.util.Random;

public class QuickSort {

    public static void sort(int[] numbers){
        quicksort(numbers, 0, numbers.length -1);
    }
    // generate number array
    public static int[] generate(int length, int lowindex, int highindex){
        int[] numbers = new int[length];
        Random random = new Random();
        for ( int i =0; i<length; i++){
            numbers[i] = random.nextInt(highindex - lowindex +1) + lowindex;
        }
        return numbers;
    }
    private static void quicksort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex < highIndex) {
            int pivot = partition(array, lowIndex, highIndex);
            quicksort(array, lowIndex, pivot -1);
            quicksort(array, pivot +1, highIndex );
        }


    }

    private static int partition(int[] array, int lowIndex, int highIndex) {
        int i = lowIndex -1;
        int pivot = array[highIndex];

        for (int j = lowIndex; j <= highIndex -1; j++){
           if(array[j] < pivot){
               i++;
               swap(array, i, j);
           }
        }
        swap(array,i+1, highIndex );
        return i +1;

    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
