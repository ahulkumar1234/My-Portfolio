import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter First Number :");
        int a=scn.nextInt();
        System.out.print("Enter Second Number :");
        int b=scn.nextInt();
        int nfact=1;
        for(int i=1;i<=a;i++){
            nfact*=i;
        }
        int rfact=1;
        for(int i=1;i<=b;i++){
            rfact*=i;
        }                                             //nCr permutation formula = n factorial/r factorial * n-r factorial 
        int n_rfact=1;
        for(int i=1;i<=a-b;i++){
           n_rfact*=i;
        }
        int ncr = nfact/(rfact*n_rfact);
        System.out.println("NCR Permutation is :"+ncr);
    }
}
 