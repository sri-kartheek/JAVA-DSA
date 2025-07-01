package Stringss;

import java.util.Scanner;

public class userNameFromMailID {
    public static void main(String[] kk){
        Scanner sc=new Scanner(System.in);
        String s=new String(),res=new String();
        s=sc.next();
        res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='@'){
                break;
            }
            else{
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }   
}
