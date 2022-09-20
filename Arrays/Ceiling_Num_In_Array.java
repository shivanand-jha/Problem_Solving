package Arrays;

public class Ceiling_Num_In_Array {
    public static void main(String[] args) {
        int[] a = {2,3,4,5,9,11,16,18};
        System.out.println(floor(a,15));
        System.out.println(ceiling(a,15));
    }
    public static int ceiling(int[] a ,int target)
    {
        int start =0;
        int end  =a.length-1;
        if(target>a[end] ||a[0]>target )
        {
            return -1;
        }
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(a[mid]==target)
            {
                return a[mid];
            }
            else if (a[mid]<target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return a[start];
    }
    public static int floor(int[] a ,int target) {
        int start = 0;
        int end = a.length - 1;
        if(target>a[end] ||a[0]>target)
        {
            return -1;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == target) {
                return a[mid];
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return a[start-1];
    }
}
