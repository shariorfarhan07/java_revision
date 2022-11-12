package algorithm.binarySearch;

public class binarySearch_iterative_decending_array {
    public static void main(String[] args) {

        int array[]=new int[1000];
        for (int i = array.length-1; i >=0; i--) {
            array[i]=i+1;
        }
        System.out.println(binarySearch(array,5));
        System.out.println(binarySearch(array,50));
    }
    public static int binarySearch(int arr[] , int target ){
        int start=0,end=arr.length-1,mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
}