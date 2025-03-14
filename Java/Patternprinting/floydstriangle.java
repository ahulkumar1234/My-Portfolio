import java.util.Scanner;
public class floydstriangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter row :");
        int r=scn.nextInt();
        int n=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
               // if(n<10)System.out.print(" "); //not required for this code it just for space to look beautiful..
               n++;
            }
            System.out.println();
        }
    }
}
