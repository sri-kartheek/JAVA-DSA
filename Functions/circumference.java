import java.util.Scanner;

public class circumference {
     public static double circum(int n){
        return 6.28*n; 
        }
    public static void main(String[] para){
        Scanner sc=new Scanner(System.in);
        int r =sc.nextInt();
        System.out.print(circum(r));
        sc.close();
    }
}
