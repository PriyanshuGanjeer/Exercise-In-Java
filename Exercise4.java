//Find a pair with the given sum in an array
import java.util.*;

public class Exercise4
{
    public static void main(String[] args) {
        int a[] ={6,8,3,2,4,7,9,0,1};
        Arrays.sort(a); //This will be sort arrays in ascending order
        int target=10; // Find two number in arrays which sum =10
        int i=0; //This will point out lower index of array
        int j=a.length-1; // This will point out higher index of array
        while(i<j){
            if(a[i]+a[j]==target){
                System.out.println("Number Found"+" "+"(" +a[i]+ ","+a[j]+")");
            }
            if(a[i]+a[j]<target){
                i++;
            }
            else{
                j--;
            }
        }

    }
}
