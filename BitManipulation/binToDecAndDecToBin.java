package BitManipulation;

import java.util.Scanner;

public class binToDecAndDecToBin {
    public static StringBuilder decToBin(int n){
        StringBuilder sb=new StringBuilder("");
        while(n!=0){
            sb.append(n&1);
            n>>=1;
        }
        return sb.reverse();
    }
    public static int binToDec(int n){
        int i=1,res=0;
        while(n!=0){
            res+=i*(n%10);
            n/=10;
            i*=2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1. To convert a binary number to Decimal number\n2. To convert a decimal number to binary number\nEnter 1 or 2:");
        int n=sc.nextInt();
        if(n==1){
            System.out.println(binToDec(sc.nextInt()));
        }
        else if(n==2){ 
            System.out.println(decToBin(sc.nextInt()));
        }
    }
}
