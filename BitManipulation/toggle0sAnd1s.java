package BitManipulation;
import java.util.Scanner;
public class toggle0sAnd1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number and position to toggle:");
        int n=sc.nextInt(),pos=sc.nextInt();
        if(getSetClearUpdateBit.getBit(n,pos)==0){
            n=getSetClearUpdateBit.setBit(n,pos);
        }
        else{
            n=getSetClearUpdateBit.clearBit(n,pos);
        }
        System.out.println(n);
    }
    
}
