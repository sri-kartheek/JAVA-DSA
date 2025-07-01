package Stringss;
import java.util.Scanner;
public class arrayOfStrings {
    public static void main(String[] kk){
        Scanner sc=new Scanner(System.in);
        int len=0,n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            len+=s[i].length();
        }
        System.out.println(len);
    }
}
