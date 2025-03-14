import java.util.Scanner;
public class hollowrectangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter row :");
        int n =scn.nextInt();
        System.out.print("Enter column :");
        int m =scn.nextInt();
        for(int i=1;i<=n;i++){ //row
            for(int j=1;j<=m;j++){ //columns
             if(i==1 || i==n || j==1 || j==m) System.out.print("* ");
             else System.out.print("  ");
            }
            System.out.println();
    }
}
}