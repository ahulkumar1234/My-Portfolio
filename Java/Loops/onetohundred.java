import java.util.Scanner;
public class onetohundred {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number n :");
        int n = scn.nextInt();
        System.out.print("Enter a number m :");
        int m = scn.nextInt();
        for(int i=n;i<=m;i++){
            System.out.print(i+" ");
        }
    }
}
