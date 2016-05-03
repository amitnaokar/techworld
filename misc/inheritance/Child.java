package inheritance;

/**
 * Created by Amit on 03-May-16.
 */
public class Child extends Parent{

    @Override
    public void print() {
        System.out.println("from child");
    }

    public static void main(String args[]){
        Parent p = new Child();
        p.print();
        p.a=1;
        System.out.println("p.a:"+p.a);
        Child c = new Child();
        c.print();
        c.printStatic();
        c.a = 2;
        System.out.println("c.a:"+c.a);
    }

}
