package BitManipulation;

import java.util.Scanner;

public class countOf1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number and know no. of 1 bits in its binary form:");
        int n=sc.nextInt(),c=0;
        while(n!=0){
            if((n&1)==1){
                c+=1;
            }
            n>>=1;
        }
        System.out.println("The entered number has "+c+" 1 bits");
    }
}
