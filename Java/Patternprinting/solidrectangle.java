import java.util.Scanner;
public class solidrectangle {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter row :");
        int r =scn.nextInt();
        System.out.print("Enter column :");
        int c=scn.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.err.println();//enter
        }
    }
}
