    package inherit2;

    public class Zi extends Fu {
        /* 编译【出错】，子类不能重写父类私有的方法*/
    //    @Override
    //    private void show() {
    //        System.out.println("Zi中show()方法被调用");
    //    }
        /* 编译【出错】，子类重写父类方法的时候，访问权限需要大于等于父类 */
        /*@Override
        private void method() {
            System.out.println("Zi中method()方法被调用");
        }*/
        /* 编译【通过】，子类重写父类方法的时候，访问权限需要大于等于父类 */

        @Override
        public void method() {
            System.out.println("Zi中method()方法被调用");
        }
    }

