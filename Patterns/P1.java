package Patterns;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
       p1(n);
       p2(n);
       p3(n);
       p4(n);
       p5(n);
       p6(n);
        p7(n);
        p8(n);
        p9(n);
        p10(n);
    }
    public static void p1(int n)
    {
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void p2(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void p3(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p4(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p5(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = n; j>=i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void p6(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j =i; j >=1; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void p7(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p8(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print(" ");
        }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void p9(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j =2; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void p10(int n)
    {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
