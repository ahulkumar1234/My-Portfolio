import java.util.Scanner;
public class Breakstatement {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter n :");
       int n=scn.nextInt();
     //  int hf=1;
       for(int i=1;i<=n;i++){
        if(n%i==0)
      //  hf=i;
        System.out.println(i);
       }
     //  System.out.println(hf);
    }
}
