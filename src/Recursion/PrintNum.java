package Recursion;

public class PrintNum {
    public static void main(String[] args) {
        asc(5);
        System.out.println("DESCENDING");
        des(5);
    }
    public static void asc(int n)
    {
        if(n==0)
        {
            return;
        }
        asc(n-1);
        System.out.println(n);
    }
    public static void des(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        des(n-1);
    }
}
