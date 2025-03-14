import java.util.Scanner;
public class greatestofthreenested {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = scn.nextInt();
        System.out.print("Enter second number :");
        int b = scn.nextInt();
        System.out.print("Enter third number :");
        int c = scn.nextInt();
        if(a>b){
            if(a>c){
                System.out.print("largest number is "+a);
            }
            else{
                System.out.println("largest number is "+c);
            }
        }
        else{
            if(b>c){
                if(b>a){
                    System.out.println("largest number is "+b);
                }
            }
            else{
                if(c>b){
                    if(c>a){
                        System.out.println("largest number is "+c);
                    }
                }
            }
        }
    }
}
