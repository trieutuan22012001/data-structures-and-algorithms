package algorithm.pakage;

import java.util.Arrays;

import java.util.Random;

public class BubbleSort {
    public int[] numbers;
        public BubbleSort(int length){
            this.numbers = generate(length);
        }

    // generate number array
    public int[] generate(int length){
        int[] numbers = new int[length];
        Random random = new Random();
        for ( int i =0; i<length; i++){
            numbers[i] = random.nextInt(100);
        }
        return numbers;
    }


    // algorithm bubble sort here
    public void bubblesort(){
        boolean swapped = true;
        while (swapped){
            swapped = false;
            for (int i =0; i< numbers.length -1; i++){
                if (numbers[i] > numbers[i+1]){
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
    }

    public void prints(){
            for (int i =0; i < this.numbers.length; i++){
                System.out.println(this.numbers[i] + " ");
            }
        System.out.println();
    }

}
