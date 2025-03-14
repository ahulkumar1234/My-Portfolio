import java.util.Scanner;
public class AP {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scn.nextInt();
        // for(int i =1;i<=2*n-1;i+=2){
        //     System.out.println(i);
        // }
        int a=4,d=3;
        for(int i =1;i<=n;i++){
            System.out.println(a);
            a+=d;
        }
        // for(int a =4;a<=3*n+1;a+=3){
        //     System.out.println(a);
        // }
    }
}
