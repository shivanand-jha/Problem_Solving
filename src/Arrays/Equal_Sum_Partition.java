package Arrays;

public class Equal_Sum_Partition {
    public static void main(String[] args) {
        int[] a = {1,5,2,2,11};
        int s=0;
        System.out.println(equalSum(a,s));
    }
    public static boolean equalSum(int[] a,int sum)
    {
        int n =a.length;
        for (int i = 0; i < a.length; i++) {
            sum = sum+a[i];
        }
        if((sum & 1)==1)
        {
            return false;
        }
        else if ((sum & 1) ==0){
            return isSubsetSum(a,n,sum/2);
        }return true;
    }
    static boolean isSubsetSum(int arr[], int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0 && sum != 0)
            return false;
        if (arr[n - 1] > sum)
            return isSubsetSum(arr, n - 1, sum);
        return isSubsetSum(arr, n - 1, sum)
                || isSubsetSum(arr, n - 1, sum - arr[n - 1]);
    }
}
