interface Jumping {
    void jump();
}
class JumpingOperator {
    public void useJumpping(Jumping j) { //Jumpping j = new Cat();
        j.jump();
    }
    public Jumping getJumpping() {
        Jumping j = new Cat();
        return j;
    }
}
class Cat implements Jumping {
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
public class Main {
    public static void main(String[] args) {
//创建操作类对象，并调用方法
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();
        jo.useJumpping(j);
        Jumping j2 = jo.getJumpping(); //new Cat()
        j2.jump();
    }
}