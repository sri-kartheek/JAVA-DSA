package sortings;
import java.util.Arrays;

public class QuickSort {
    public static int indexFinder(int[] a,int si,int ei){
        int i=si-1;
        int piv=a[ei];
        for(int j=si;j<ei;j++){
            if(a[j]<piv){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        i+=1;
        int temp=a[i];
        a[i]=piv;
        a[ei]=temp;
        return i;
    }
    public static void quikSort(int[] a,int si,int ei){
        if(si<ei){
            int pi=indexFinder(a,si,ei);
            quikSort(a,si,pi-1);
            quikSort(a,pi+1,ei);
        }
    }
    public static void main(String[] args) {
        int a[]={-1, 3, -5, 7, 0, -2};
        int n=a.length;
        quikSort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }    
}
