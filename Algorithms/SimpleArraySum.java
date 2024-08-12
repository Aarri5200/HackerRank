import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
             arr[i]= sc.nextInt();
        }
        for(int i: arr){
            sum+=i;
        }
        System.out.println(sum);
    }
}
