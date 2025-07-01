import java.util.Scanner; 
public class fibonacci {
    public static void fib(int n){
        if(n==1){
            System.out.println("0");
        }
        else{
            int a=0,b=1;
            System.out.print(a+" "+b);
            if(n>2){
                int c;
                for(int i=0;i<n-2;i++){
                    c=a+b;
                    a=b;
                    b=c;
                    System.out.print(" "+c);

                }
            }
        }
    }
    public static void main(String[] karu){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
    }
    
}
