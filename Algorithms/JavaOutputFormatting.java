import java.util.Scanner;

public class Solution {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            //Complete this line
            if ( s1.length() <15)
            {
                for(int j=s1.length(); j < 15; j++)
                {
                    s1 += " ";
                }
                System.out.print(s1);
            }
            String intLength = String.valueOf(x);
            if (intLength.length() == 3)
            {
                System.out.println(x);
            }
            else if (intLength.length() < 3)
            {
                while(intLength.length() < 3)
                {
                    intLength = "0" + intLength;
                }
            System.out.println(intLength);
            }

        }
        System.out.println("================================");
        sc.close();

}
}
