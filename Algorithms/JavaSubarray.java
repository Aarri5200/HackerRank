import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      int n;
      int count=0;
      
      Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
      for(int i=0;i<n;i++){
          int sum=0;
          for(int j=i;j<n;j++){
              sum=sum+arr[j];
              if(sum<0){
                  count++;
              }
          }
      }
       System.out.println(count);
    }
}
