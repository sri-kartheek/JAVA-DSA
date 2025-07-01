package sortings;
import java.util.Arrays;
public class MergeSort {
    public static void merge(int[] a,int si,int mid,int ei) {
        int[] merged=new int[ei-si+1];
        int ind1=si;
        int ind2=mid+1;
        int x=0;
        while(ind1<=mid && ind2<=ei){
            if(a[ind1]>a[ind2]){
                merged[x++]=a[ind2++];
            }
            else{
                merged[x++]=a[ind1++];
            }
        }
        while(ind1<=mid){
            merged[x++]=a[ind1++];
        }
        while(ind2<=ei){
            merged[x++]=a[ind2++];
        }
        for(int i=0,j=si;i<merged.length;j++,i++){
            a[j]=merged[i];
        }
        
    }
    public static void divide(int[] a,int si,int ei){
        if(si>=ei){
            System.out.println("["+a[si]+"]");
            return;
        }
        int[] subArray = Arrays.copyOfRange(a, si, ei + 1);
        System.out.println(Arrays.toString(subArray));
        int mid=si+(ei-si)/2;
        divide(a,si,mid);
        divide(a,mid+1,ei);
        merge(a,si,mid,ei);
        
    }
    public static void main(String[] args) {
        int a[]={6,1,4,5,2,3};
        int n=a.length;
        divide(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
