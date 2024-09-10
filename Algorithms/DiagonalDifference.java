import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class solution{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Sum1=0,Sum2=0,Diff;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    Sum1+=arr[i][j];
                }
               if(i+j==n-1){
                   Sum2+=arr[i][j];
               }
            }
        }
     Diff=Sum1-Sum2;
     if(Diff<0){
         Diff=Diff*(-1);
     }
     System.out.printf("%d", Diff);
        
        
        
    }
}
