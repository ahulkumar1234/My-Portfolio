import java.util.Scanner;
public class oddnumbertriangle {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter row :");
        int r =scn.nextInt();
        for(int i =1;i<=r;i++){
            for(int j=1;j<=i;j++){
              System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }
    }
}
