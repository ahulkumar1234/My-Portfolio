import java.util.Scanner;
public class zeroandonetriangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter row :");
        int n =scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%2!=0){
                    if(j%2!=0) System.out.print(1+" ");
                    else System.out.print(0+" ");
                }
                else {
                    if(j%2==0)System.out.print(1+" ");
                    else System.out.print(0+" ");
                }
                
            }
            System.out.println();
        }
    }
}
