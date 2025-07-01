import java.util.Scanner;

public class voteEligibility {
    public static void eligible(int n){
        if(n>18){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("NOt eligible to vote");
        }
    }
    public static void main(String para[]){
        Scanner sc=new Scanner(System.in);
        int age =sc.nextInt();
        eligible(age);
        sc.close();
    }
}
