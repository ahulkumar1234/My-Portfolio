import java.util.Scanner;

public class alphabetultatriangle {
     public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter row :");
        int r =scn.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r+1-i;j++){
                 System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}

