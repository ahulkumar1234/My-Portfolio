import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter First Number :");
        int a=scn.nextInt();
        System.out.print("Enter Second Number :");
        int b=scn.nextInt();
        int pfact=1;
        for(int i=1;i<=a;i++){
            pfact*=i;
        }                                          //pCr permutation formula = p factorial/p-r factorial 
       int p_rfact=1;
       for(int i=1;i<=a-b;i++){
          p_rfact*=i;
       }
       int pcr=pfact/(p_rfact);
       System.out.println("PCR Permutation is :"+pcr);
    }
}
