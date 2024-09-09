import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       float x,y,z;
       int sum1=0;
       int sum2=0;
       int sum3=0;
       int[] arr= new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       for(int j=0;j<n;j++){
           if(arr[j]>0){
               sum1=sum1+1;
           }
           else if(arr[j]<0){
               sum2=sum2+1;
           }
           else if(arr[j]==0){
               sum3=sum3+1;
           }
       }
        x = (float) sum1/n;
        y = (float) sum2/n;
        z = (float) sum3/n;
        System.out.printf("%.6f\n",x);
        System.out.printf("%.6f\n",y);
        System.out.printf("%.6f\n",z);
    }
}
