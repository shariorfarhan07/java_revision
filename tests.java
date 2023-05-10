public class tests {
    public static void main(String[] args) {
        int [] a={2,2,1,1,4,4,5,5,6,6,6};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum^a[i];
        }
        System.out.println(sum);

    }
}
