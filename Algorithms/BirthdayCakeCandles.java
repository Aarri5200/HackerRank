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
        int [] candles = new int[n];
        int max=candles[0];
        int Sum=0;
        for(int i=0;i<n;i++){
            candles[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
         if(max<candles[i]){
             max=candles[i];
         }   
        }
        
        for(int j=0;j<n;j++){
            if(candles[j]==max){
                Sum++;
            }
        }
        System.out.printf("%d", Sum);
    }
}

