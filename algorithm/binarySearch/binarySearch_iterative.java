package algorithm.binarySearch;

public class binarySearch_iterative {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
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
