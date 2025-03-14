import java.util.Scanner;
public class greatestofthree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = scn.nextInt();
        System.out.print("Enter second number : ");
        int b = scn.nextInt();
        System.out.print("Enter third number : ");
        int c = scn.nextInt();
        if(a>b && a>c){
         System.out.print(a+" is largest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is largest number");
        }
        else{
            System.out.println(c+" is largest number");
        }
    }
}