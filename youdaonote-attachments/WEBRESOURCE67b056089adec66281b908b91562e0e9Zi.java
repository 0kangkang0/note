package inherit2;

public class Zi extends Fu {
    int age=30;
    public void show(){
        int age =20;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
