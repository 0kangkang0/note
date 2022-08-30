package inherit2;

public class InterImpl implements inter{
    public InterImpl() {
        super();//继承Object类
    }

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void method() {
        System.out.println("method");
    }
}
