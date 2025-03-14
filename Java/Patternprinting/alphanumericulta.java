import java.util.Scanner;

public class alphanumericulta {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter row :");
        int r = scn.nextInt();
        for(int i =1;i<=r;i++){
            for(int j=1;j<=r+1-i;j++){
               if(i%2!=0) System.out.print((char)(i+64)+" ");
               else System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


