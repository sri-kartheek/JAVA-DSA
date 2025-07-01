import java.util.*;
public class oddSumm{
    public static void oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum+=i;
            }        
        }
        System.out.println(sum);
    }
    public static void main(String params[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        oddSum(n);
    }
}