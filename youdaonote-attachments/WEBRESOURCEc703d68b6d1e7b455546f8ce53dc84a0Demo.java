package inherit;

public class Demo {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.age="1";
        zi.name="GHUIY";
        Fu fu = new Fu();
        fu.age="114514";
        fu.name="gauebikgh";
        System.out.println("FU:"+fu.age+"\t"+fu.name);
        zi.pr();
    }
}
