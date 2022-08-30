package inherit2;

public class Demo {
    public static void main(String[] args) {
        Fu fu=new Zi();
        fu.show();

        Zi zi=(Zi)fu;
        zi.show();
        zi.play();
    }
}
