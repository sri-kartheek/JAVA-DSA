package BitManipulation;
import java.util.Scanner;
public class getSetClearUpdateBit {
    public static int getBit(int n,int pos){
        int bitMask=1<<pos;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setBit(int n,int pos){
        int bitMask=1<<pos;
        return bitMask|n;
    }
    public static int clearBit(int n,int pos){
        int bitMask=~(1<<pos);
        return bitMask&n;
    }
    public static int updateBit(int n,int pos,int bit){
        if(bit==0){
            return clearBit(n,pos);
        }
        else{
            return setBit(n,pos);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) { 
            System.out.println("'1' for GetBit\n'2' for SetBit\n'3' for ClearBit\n'4' for UpdateBit\n '0' for exiting\nEnter: ");
            int num,n=sc.nextInt();
            switch(n){
                case 0:
                    break;
                case 1:
                    System.out.println("Enter number and position of bit:");
                    System.out.println(getBit(sc.nextInt(),sc.nextInt()));
                case 2:
                    System.out.println("Enter number and position of bit:");
                    num=setBit(sc.nextInt(),sc.nextInt());
                    System.out.println("The number after setBit is "+num);
                case 3:
                    System.out.println("Enter number and position of bit:");
                    num=clearBit(sc.nextInt(),sc.nextInt());
                    System.out.println("The number after clearBit is "+num);
                case 4:
                    System.out.println("Enter number, position of bit and altering bit(0 or 1):");
                    num=updateBit(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    System.out.println("The updated number after changing Bit is "+num);
            }

        }
    }
}
