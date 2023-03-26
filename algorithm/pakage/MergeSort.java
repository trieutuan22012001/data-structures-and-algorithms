package algorithm.pakage;

import java.util.Random;

public class MergeSort {

//    constructor
    public MergeSort(int[] array){
         mergeSort(array);
    }
    public static int[]  generate(int length){
        int[] array = new int[length];
        Random random = new Random();
        for ( int i =0; i<length; i++){
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void mergeSort(int[] arr){
        int SizeArray = arr.length;

        if (SizeArray < 2){
            return;
        }
        int midIndex = SizeArray / 2;
// create two storage to copy item from old array
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[SizeArray - midIndex];

        for (int i = 0; i<midIndex; i++){
            leftHalf[i] = arr[i];
        }
        for ( int i = midIndex; i <SizeArray; i++){
            rightHalf[i-midIndex] = arr[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(leftHalf, rightHalf, arr);
    }
    private static void merge(int[] leftHalf, int[] rightHaft, int[] array ){
        int i =0;
        int l = 0;
        int r = 0;
        while (l < leftHalf.length && r < rightHaft.length ){
            if(leftHalf[l] <= rightHaft[r]){
                array[i] = leftHalf[l];
                i++;
                l++;
            }else{
                array[i] = rightHaft[r];
                i++;
                r++;
            }
        }
    // rightHalf is empty
    while (l < leftHalf.length){
        array[i] = leftHalf[l];
        i++;
        l++;
        System.out.println("right is empty");
    }
    // leftHalf is empty
        while (r < rightHaft.length){
            array[i] = rightHaft[r];
            i++;
            r++;
            System.out.println("left is empty");
        }
    }

}
