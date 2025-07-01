import java.util.Scanner;

public class gcDivisor{
    public static void gcDiv(int a, int b) {
        int minn=a<b?a:b;
        int maxx=a+b-minn;
        int i=1;
        while((minn*i)%maxx!=0){
            i+=1;
        }
        System.out.println((a*b)/(minn*i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcDiv(a,b);
        sc.close();
    }
}
