import java.util.Scanner;
public class Leastnumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter first number :");
        int a =scn.nextInt();
        System.out.print("Enter second number :");
        int b =scn.nextInt();
        System.out.print("Enter third number :");
        int c =scn.nextInt();
        System.out.print("Enter forth number :");
        int d =scn.nextInt();
        System.out.print ("Least number is :"+Math.min(Math.min(a,b),Math.min(c,d)));
    }
}

