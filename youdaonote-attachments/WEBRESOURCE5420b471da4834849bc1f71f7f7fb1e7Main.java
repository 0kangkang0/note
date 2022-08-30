class Cat {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
class CatOperator {
    public void useCat(Cat c) { //Cat c = new Cat();
        c.eat();
    }
    public Cat getCat() {
        Cat c = new Cat();
        return c;
    }
}
public class Main {
    public static void main(String[] args) {
//创建操作类对象，并调用方法
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);
        Cat c2 = co.getCat(); //new Cat()
        c2.eat();
    }
}