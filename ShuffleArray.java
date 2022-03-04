
/*
Given array {x1,x2,x3..Xn,y1,y2,y3,..Yn}
from x1 to Xn size of array is n and y1 to Yn size of array is n
total size of array is 2n;
ShuffleArray such that {x1,y1,x2,y2,x3,y3...Xn,Yn}
*/
import java.util.*;
public class ShuffleArray
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        
        int n=arr.length;
        int x=0 , a=0;
        int y=n/2;
        int ans[]=new int[n];
        while(a<n){
            ans[a++]=arr[x++];
            ans[a++]=arr[y++];
        }
        System.out.println("Given Array - "+Arrays.toString(arr));
        System.out.println("After Shuffle Array- " + Arrays.toString(ans));
    }
}
