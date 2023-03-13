package data_struture;

public class Array {
    private int[] items;
    private int count;
//    constructor
    public Array(int length){
        items = new int[length];
    }

//    method print array with length
    public void print(){
        for ( int i =0 ; i < count; i++){
            System.out.println(items[i]);
        }
    }

//    implement insert method to Array
    public void insert(int item){
//       if array fully, we need to resize it
        if (items.length == count){
    //    create new array with larger size
            int[] newItems = new int[count * 2] ;
    //    copy all item in old array
            for ( int i =0 ; i < count; i++){
                newItems[i] = items[i];
            }
    //    set all item into new larger array
            items = newItems;
        }
//        add item to the end array
        items[count++] = item;
    }

//    implement remove Array method
    public void removeAt(int index){
    //  if index > length of array or index <0 --> error
        if (index <0 || index >= count)
            throw new IllegalArgumentException();
        //  set the item in right index item to the left
        for ( int i = index; i < count ; i++ ){
                items[i] = items[i+1];

        }
        count--;
    }
    public int indexOf(int item){
        for ( int i= 0 ; i < count ; i++)
           if (items[i] == item)
               return i;
        return -1;
    }

}
