public class method {
    public static void main(String[] args){
        add(50, 10);
        add(40, 70);
        System.out.println(add_1(10, 20));
    }
    public static void add(int x, int y){
        System.out.println(x+y);
    }
    public static int add_1(int x, int y){
        return x+y;
    }
}
