public class Returnkeyword {
    public static void greet(int time) {
        // if(time<12) System.out.println("Good Morning");
        // else System.out.println("Good Afternoon");
        if(time<0) return;
        System.out.println("Good Morning");
    }
    public static void main(String[] args) {
        greet(-6);
    }
}
