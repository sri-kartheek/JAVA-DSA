package Recursion;
import java.util.*;
public class permutations {
    public static void main(String[] prms){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string and get its permutations:");
        String str=sc.next();//abc
        System.out.println("The Permutations of "+str+" are:");
        perm(str,"");
    }
    public static void perm(String s,String res){ //abc "" - bc,a - c,ab - 
        if(s.length()==0){//3 2 1 0 
            System.out.println(res);//abc 
            return;
        }
        for(int i=0;i<s.length();i++){//0 - 0 - 0 
            perm(s.substring(0,i)+s.substring(i+1), res+s.charAt(i));
        }
    }
}
