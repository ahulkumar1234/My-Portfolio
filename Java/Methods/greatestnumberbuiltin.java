import java.util.Scanner;
public class greatestnumberbuiltin {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter  first number :");
        int a =scn.nextInt();
        System.out.print("Enter  second number :");
        int b =scn.nextInt();
        System.out.print("Enter  third number :");
        int c =scn.nextInt();
        System.out.print ("Maximum number is :"+Math.max(a,Math.max(b,c)));
    }
}
