package bs1;
import java.util.*;
class binary{
 int search(int a[],int f,int l,int y){
     int mid=f+(l-f)/2;
     if(a[mid]==y) return mid;
     if(a[mid]>y) return search(a,f,mid-1,y);
     else
         return search(a,mid+1,l,y);
 }
}
public class Main {

    public static void main(String[] args) {
	binary ob=new binary();
	int a[]={41,32,63,14,15,96,27};
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter number to be searched: ");
	int y=s1.nextInt();
	int f=0;
	int l=a.length;
	System.out.println("At Index: "+ob.search(a,f,l,y));
	Arrays.sort(a);
	for(int x:a){
        System.out.println(x);
    }
    int p=Arrays.binarySearch(a,32);
        System.out.println(p);
    }
}
