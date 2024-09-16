import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution{
    public static int Round(int x){
        return (int)(Math.round(x / 5.0) * 5);
    }
    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int grades[] = new int[n];
        int Rounder[] = new int[n];
        for(int i=0;i<n;i++){
            grades[i] = sc.nextInt();
           
        }
        for(int i=0;i<n;i++){
            Rounder[i]= (grades[i] + 4) / 5 * 5;
    }
    for(int i=0;i<n;i++){
         if (grades[i] < 38) {
            grades[i]=grades[i]+0;
        }
        if (Rounder[i] - grades[i] < 3 && grades[i] >= 38) {
            grades[i] = Rounder[i];
        } else {
            grades[i] = grades[i]; // Otherwise, keep the original grade
        }
    }
     for (int i = 0; i < n; i++) {
            System.out.println(grades[i]);
        }
    }   
    }

