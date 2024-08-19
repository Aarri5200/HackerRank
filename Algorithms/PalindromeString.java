import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       char[] ch = A.toCharArray();
       boolean flag = true;
       int p = 0;
       int q = ch.length-1;
       while(p<=q){
           if(ch[p]!=ch[q]){
              flag=false;
              break;
           }
           p++;
           q--;
}
    if(flag == false){
        System.out.println("No");
    }
    else{
        System.out.println("Yes");
    }
    }  
}
