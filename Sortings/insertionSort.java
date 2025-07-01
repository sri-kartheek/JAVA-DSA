package sortings;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt(),i,j,alt,a[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=1;i<n;i++){     
            j=i-1;
            alt=a[i];
            while(j>=0 && alt<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=alt;
        }
        System.out.println("The sorted array is:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
