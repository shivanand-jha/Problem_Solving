package Questions.Maths;

public class Sieve {
    public static void main(String[] args) {
        int n=60;
        boolean[] primes = new boolean[n+1];
        seive(n,primes);
    }
    static void seive(int n ,boolean[] arr)
    {
        for (int i = 2; i*i<=n; i++) {
            if (!arr[i])
            {
                for (int j = i*2; j <=n; j=j+i) {
                    arr[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!arr[i])
            {
                System.out.println(i+" ");
            }
        }

    }
}

