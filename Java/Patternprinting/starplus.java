import java.util.Scanner;
public class starplus {
    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
        System.out.print("Enter row :");
        int n =scn.nextInt();
        int mid =n/2+1;
        for(int i =1;i<=n;i++){ //row
            for(int j=1;j<=n;j++){ //columns
                if(i==mid || j==mid) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
