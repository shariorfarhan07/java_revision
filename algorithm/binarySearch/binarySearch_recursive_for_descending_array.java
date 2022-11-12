package algorithm.binarySearch;

public class binarySearch_recursive_for_descending_array {
    public static void main(String[] args) {
        int array[]=new int[1000];
        for (int i = array.length-1; i >=0; i--) {
            array[i]=i+1;
        }
        System.out.println(binarySearch(array,5,0,array.length-1));
        System.out.println(binarySearch(array,50,0,array.length-1));
    }

    private static int binarySearch(int[] array, int target, int start, int end) {
        int mid=(start+end)/2;
//        System.out.println(mid+" "+start+" "+end);
        if(start>end)return -1;
        if(array[mid]==target){
            return mid;
        } else if (array[mid]>target) {
            return binarySearch(array,target,start,mid-1);
        }else{
            return binarySearch(array,target,mid+1,end);
        }
    }
}
