import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int v = 0;
            for(int j=0;j<n;j++){
                int p = (int) Math.pow(2,j);
                int q=p*b;
                int result = a+(v+q);
                v +=q;
                System.out.print(result+ " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
