import java.util.Scanner;
public class youngestofthree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter age of ram : ");
        int ram = scn.nextInt();
        System.out.print("Enter age of shyam : ");
        int shyam = scn.nextInt();
        System.out.print("Enter age of ajay : ");
        int ajay = scn.nextInt();
        if(ram>shyam && ram>ajay){
         System.out.print(ram+" Ram is youngest");
        }
        else if(shyam>ram && shyam>ajay){
            System.out.println(shyam+" Shyam is youngest");
        }
        else{
            System.out.println(ajay+"Ajay is youngest");
        }
    }
}
