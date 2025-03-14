import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n =scn.nextInt();
        int a =3,r=4;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=r;
        }
    }
}
