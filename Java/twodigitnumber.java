import java.util.Scanner;
public class twodigitnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = scn.nextInt();
        if(n<100 && n>90){
            System.out.print("It is two digit number");
        }
        else{
            System.out.print("It is not a two digit number");
        }
    }
}
