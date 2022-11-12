package algorithm.binarySearch;

public class binarySearch_recursive {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
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
