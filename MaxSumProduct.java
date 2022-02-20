// Find Maximum Sum Of product in given unsorted array
import java.util.*;
public class MaxSumProduct
{
    public static void main(String[] args) {
        int a[]={2,1,4,7,3,8,5};
        MaxProduct(a);
       
    }
    public static void MaxProduct(int a[]){
        int n=a.length;
        if(n<2){
            return;
        }
        Arrays.sort(a);
        if((a[0]*a[1])>(a[n-1]*a[n-2])){
            System.out.println("Pair is"+" "+ a[0]+","+a[1]);
            
        }
        else{
            System.out.println("Pair is"+" "+a[n-1]+","+a[n-2]);
        }
    }
}
