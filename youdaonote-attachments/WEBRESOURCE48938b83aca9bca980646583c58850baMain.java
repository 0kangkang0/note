abstract class Animal {
    public abstract void eat();
}
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
class AnimalOperator {
    public void useAnimal(Animal a) { //Animal a = new Cat();
        a.eat();
    }
    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }
}
public class Main {
    public static void main(String[] args) {
//创建操作类对象，并调用方法
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.useAnimal(a);
        Animal a2 = ao.getAnimal(); //new Cat()
        a2.eat();
    }
}