package any;
//Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included.
//Here is a time efficient solution with O(n) extra space. The ugly-number sequence is 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
//     because every number can only be divided by 2, 3, 5, one way to look at the sequence is to split the sequence to three groups as below:
//     (1) 1×2, 2×2, 3×2, 4×2, 5×2, …
//     (2) 1×3, 2×3, 3×3, 4×3, 5×3, …
//     (3) 1×5, 2×5, 3×5, 4×5, 5×5, …
//THIS IS DP APPROACH OF UGLY NUMBERS
import java.util.*;

    class uglynosDPappr {
        int ugly(int n){
            int[] ugly=new int[n];
            int i2=0,i3=0,i5=0;
            int next_mul_2=2;
            int next_mul_3=3;
            int next_mul_5=5;
            int ugly_num=1;
            ugly[0]=1;
            for(int i=1;i<n;i++) {
                ugly_num = Math.min(next_mul_2, Math.min(next_mul_3, next_mul_5));
                ugly[i] = ugly_num;

                if(ugly_num==next_mul_2){
                    i2=i2+1;
                    next_mul_2=ugly[i2]*2;
                }
                if(ugly_num==next_mul_3){
                    i3=i3+1;
                    next_mul_3=ugly[i3]*3;
                }
                if(ugly_num==next_mul_5){
                    i5=i5+1;
                    next_mul_5=ugly[i5]*5;
                }
            }
            return ugly_num;
        }
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the position of ugly number you want to find: ");
        int n=s1.nextInt();
        uglynosDPappr obj = new uglynosDPappr();
        System.out.println(obj.ugly(n));
    }
}
