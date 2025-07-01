package StringBuilderr;

import java.util.Scanner;

public class replaceCharsSB {
    public static void main(String[] kk){
        Scanner sc=new Scanner(System.in);
        StringBuilder s=new StringBuilder(""),res=new StringBuilder("");
        s.append(sc.next());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='e'){
                res.append('i');
            }
            else{
                res.append(s.charAt(i));
            }
        }
        System.out.println(res);
    }   
}
