package algorithm.sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] a ={1,5,9,8,7,4,5,6,3,2,1};
        SortArray(a);
        debug(a);
    }
    public static void debug(int []a){System.out.println(Arrays.toString(a));}
    private static void SortArray(int[] a) {
        int value,hole;

        for (int i = 0; i < a.length; i++) {
             value=a[i];
             hole=i;
            debug(a);
            System.out.println(value+"\t"+hole);
            while(hole >0 && a[hole-1]>value){
                a[hole]=a[hole-1];
                hole--;
                debug(a);
            }
            a[hole]=value;
        }
    }

}
