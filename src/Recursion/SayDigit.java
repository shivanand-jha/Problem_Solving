package Recursion;

public class SayDigit {
    public static void main(String[] args) {
        say(432);
    }
    public static void say(int n)
    {
        String[] a ={"one","two","three","four","five","six","seven","eight","nine"};
        if(n==0)
        {
            return;
        }
        say(n/10);
        System.out.print(a[(n%10)-1]+" ");
    }
}
