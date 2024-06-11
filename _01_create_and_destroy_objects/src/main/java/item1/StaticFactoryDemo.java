package item1;

/**
 * @author BrucePang
 */
public class StaticFactoryDemo {
    public static void main(String[] args) {
        BrucePang person = BrucePang.getInstance();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
