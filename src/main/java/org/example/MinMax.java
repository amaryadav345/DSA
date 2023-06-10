package org.example;
import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        int A[]={4,7,3,8};
        System.out.println("Result is "+ solve(A));
    }
    public static int solve(int[] A) {

        int min=Integer.MAX_VALUE;
        int max=-1;
        int n=A.length,sum=0,res=0;
        int mod=1000000007;
        for(int i=0;i<n;i++){
            min=Integer.MAX_VALUE;
            max=-1;
            for(int j=i;j<n;j++){
                if(A[j]<min)
                    min=A[j];
                if (A[j] > max)
                    max=A[j];

                sum=max-min;
                res=(res % mod +sum % mod) % mod;
            }
        }
        return res;
    }
}
