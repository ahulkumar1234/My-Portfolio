import java.util.Scanner;
public class sidesoftriangle {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter first side :");
    int a = scn.nextInt();
    System.out.print("Enter second side :");
    int b = scn.nextInt();
    System.out.print("Enter third side :");
    int c = scn.nextInt();
    if(a+b>c && b+c>a && c+a>b){
        System.out.print("Valid triangle");
    }
    else{
        System.out.print("Invalid triangle");
    }
}
}