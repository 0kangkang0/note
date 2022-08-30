package inherit2;

public class Demo {
    public static void main(String[] args) {
        inter i=new InterImpl();
        System.out.println(i.num);
        System.out.println(i.num2);
        i.show();
        i.method();
        System.out.println(inter.num);
    }
}
