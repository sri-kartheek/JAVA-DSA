package sortings;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt(),i,j,alt,mini,a[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++){
            mini=i;
            for(j=i+1;j<n;j++){
                if(a[j]<a[i]){
                    mini=j;
                }
            }
            if(mini!=i){
                alt=a[i];
                a[i]=a[mini];
                a[mini]=alt;
            }
        }
        System.out.println("The sorted array is:");
        for(i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
