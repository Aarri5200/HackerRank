import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 

public class Solution {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a1=0,b1=0;
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i=0;i<3;i++){
            a[i]= sc.nextInt();       
        }
        for(int i=0;i<3;i++){
            b[i]= sc.nextInt();     
        }
        for(int i = 0;i<3;i++){
            if(a[i]>b[i]){
                a1+=1;
            }
            else if(b[i]>a[i]){
                b1+=1;
            }
        }
        int[] c = {a1,b1};
        System.out.printf("%d %d", c[0],c[1]);
        
    }
}
