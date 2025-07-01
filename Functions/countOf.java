import java.util.Scanner;

public class countOf {
    public static void main(String para[]){
        Scanner sc=new Scanner(System.in);
        int p=0,n=0,z=0;
        while(true){
            int num =sc.nextInt();
            if(num>0){
                p+=1;
            }
            else if(num<0){
                n+=1;
            }
            else{
                z+=0;
            }
            System.out.println("Do u want to add another number. '1' for YES & '0' to EXIT");
            int ch=sc.nextInt();
            if(ch==0){
                break;
            }
        }
        System.out.println(n+ " negatives"+p+" positives"+z+"zeroes");
        sc.close();
    }
}
