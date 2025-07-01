import java.util.Scanner;

public class greatest {
    public static void greatestNum(int n1,int n2){
        if(n1>n2){
            System.out.println(n1 + " is greater");
        }
        else{
            System.out.println(n2 + " is greater");
        }
    }
    public static void main(String para[]){
        Scanner sc=new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        greatestNum(n1,n2);

    }
}
