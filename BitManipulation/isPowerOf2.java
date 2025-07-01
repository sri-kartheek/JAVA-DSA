package BitManipulation;
import java.util.Scanner;
public class isPowerOf2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number and know whether it is a power of 2 or not:");
        int n=sc.nextInt();
        while(true){
            if((n&1)==1){
                n>>=1;
                break;
            }
            n>>=1;
        }
        if(n==0){
            System.out.println("The entered number is a power of 2");
        }
        else{
            System.out.println("The entered number is not a power of 2");
        }
    }
}
