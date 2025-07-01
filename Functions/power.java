import java.util.Scanner;

public class power {
    public static void pow(int n,int x){
        System.out.println((int)Math.pow(n,x));
    }
    public static void main(String para[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int x =sc.nextInt();
        pow(n,x);
        sc.close();
    }
}
