package StringBuilderr;

import java.util.Scanner;

public class arrayOfStringBuilders {
    public static void main(String[] kk){
        Scanner sc=new Scanner(System.in);
        int len=0,n=sc.nextInt();
        StringBuilder[] s=new StringBuilder[n];

        for(int i=0;i<n;i++){
            s[i]=new StringBuilder("");
            s[i].append(sc.next());
            len+=s[i].length();
        }
        System.out.println(len);
    }
}
