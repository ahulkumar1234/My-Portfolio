import java.util.Scanner;
public class tabletoNtimes {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter n :");
        int n=scn.nextInt();
        for(int i=1;i<=10;i++){
          //  if(i%2==0)
           System.out.println(n+"X"+i+" = "+(n*i));
        }
    }
}


