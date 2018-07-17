package any;
//Given a number n, count minimum steps to minimize it to 1 according to the following criteria:
//
//If n is divisible by 2 then we may reduce n to n/2.
//If n is divisible by 3 then you may reduce n to n/3.
//Decrement n by 1.
import java.util.*;

public class min2 {
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter no. to minimize to 1: ");
        int n=s1.nextInt();
        int[] rem=new int[n+1];
        int i=0;
        rem[0]=rem[1]=0;
        for(i=2;i<=n;i++){
            rem[i]=Integer.MAX_VALUE;
            if(i%2==0) rem[i]=Math.min(1+rem[i/2],rem[i]);
            if(i%3==0) rem[i]=Math.min(1+rem[i/3],rem[i]);
            rem[i]=Math.min(1+rem[i-1],rem[i]);
        }
        System.out.println("Minimum steps are: "+rem[n]);
    }
}
