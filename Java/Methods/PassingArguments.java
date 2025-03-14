public class PassingArguments {
    public static void greet(String name) {
        System.out.println("Good Morning "+name);
    }
    public static void main(String[] args) {
        greet("Rahul");
        greet("Ajay");
        sum(10,10);
        intro("Rahul",22);
        intro("Ajay",22);
    }
    public static void sum(int a ,int b) {
        System.out.println(a+b);
    }
    public static void intro(String name,int age) {
        System.out.println("Your name is "+name+" and age is "+age);
    }
}
