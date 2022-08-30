package inherit2;

public abstract class Fu {
    int age=10;
    final String a="FU";

    public Fu() {
    }
    public Fu(int age) {
        this.age = age;
    }
    public void show(){
        System.out.println(age);
        System.out.println(a);
    }
    public abstract void eat();
}