import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
    public static void main(String args[]){
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int j =0;j<5;j++){
            Long Sum=0L;
            for(int k=0;k<5;k++){
                 if(j==k){
                     continue;
                 }
                 else{
                     Sum+=arr[k];
                 }
            }
            if(Sum>=max){
                max=Sum;
            }
            if(Sum<=min){
                min=Sum;
            }
    }
    System.out.printf("%d %d", min,max);
}
}
