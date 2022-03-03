
/*
Find the maximum value of `j – i` such that `A[j] > A[i]` in an array
 The time complexity of this solution is O(n2)
*/

public class FindMaximumDifference
{
    public static int findMaxdif(int a[]){
        int diff=Integer.MIN_VALUE;
        for(int i=0;i<a.length; i++){
            for(int j=a.length-1; j>i; j--){
                if(a[i]<a[j]&& diff<j-i){
                    diff= j-i;
                }
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        int a[]={12,5,6,1,8,9};
        
        System.out.println("The maixmum value is "+findMaxdif(a));
    }
}
