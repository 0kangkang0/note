package inherit2;

public interface inter {
    public int num = 10;
    public final int num2 = 20;
    // public static final int num3 = 30;== int num3 = 30;
    int num3 = 30;
    // public Inter() {}   不存在
    // public void show() {}   不存在
    public abstract void method();//与下一行作用相同
    void show();
}
