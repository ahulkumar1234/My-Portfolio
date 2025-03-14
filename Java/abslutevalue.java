import java.util.Scanner;
public class abslutevalue {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int a=scn.nextInt();
        if(a<0){
        a = a*(-1);
        System.out.print("The absolute Value is :"+a);
        }
      //  System.out.print("The absolute Value is :"+a);
    }
}
