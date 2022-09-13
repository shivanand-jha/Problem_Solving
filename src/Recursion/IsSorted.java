package Recursion;

public class IsSorted {
    public static void main(String[] args) {

    }
    public static boolean isSorted(int[] a)
    {
        if(a.length<=1)
        {
            return true;
        }
        if(a[0]>a[1])
        {
            return false;
        }
        return isSorted(a);
    }
}
