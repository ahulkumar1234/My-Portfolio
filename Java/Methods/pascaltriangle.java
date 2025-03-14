import java.util.Scanner;
public class pascaltriangle {
    public static int fact(int x) {
        int xfact=1;
        for(int i=1;i<=x;i++){
            xfact*=i;
        }
        return xfact;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                int icj = fact(i)/(fact(j)*fact(i-j));      //This loop is for Space (Pyramid triangle)
                System.out.print(" "+" ");
            }
            for(int j=0;j<=i;j++){
                int icj = fact(i)/(fact(j)*fact(i-j));
                System.out.print(icj+"   ");
            }
            System.out.println();
        }
    }
}
