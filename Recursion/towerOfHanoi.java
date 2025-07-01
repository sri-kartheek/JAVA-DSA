import java.util.Scanner;
public class towerOfHanoi {
    public static void sort(StringBuilder s,StringBuilder h,StringBuilder d,int n){
        sort(s.substring(0,n-1),d,h,n);
        d.insert(0,s.charAt(0));
        s.delete(0,1);
    }
    public static void main(String[] args) {
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder s=new StringBuilder(""),h=new StringBuilder(""),d=new StringBuilder("");
        for (int i= 0; i< n; i++) {
            s.insert(i,Integer.toString(i+1));
        }
        System.out.println(s+"\n"+h+"\n"+d+"\n");
    }
}
