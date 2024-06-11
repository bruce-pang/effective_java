package item1.staticfactory;

/**
 * Item 1: Consider static factory methods instead of constructors
 * static factory methods advantages(优点)：
 * 1. They have names(有名字)
 * 2. They are not required to create a new object each time they are invoked(不需要每次调用时都创建一个新对象)
 * 3. They can return an object of any subtype of their return type(可以返回其返回类型的任何子类型的对象)
 * 4. They reduce the verbosity of creating parameterized type instances(减少创建参数化类型实例的冗长)
 * 5. They allow for flexible object creation(允许灵活的对象创建)
 * 6. They allow for immutable objects(允许不可变对象)
 *
 */
public class BrucePang {
    private String name;
    private int age;
    // Singleton with static factory
    private static final BrucePang INSTANCE = new BrucePang("Bruce", 30);
    private BrucePang(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static BrucePang getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        BrucePang brucePang = BrucePang.getInstance();
        System.out.println("Name: " + brucePang.getName());
        System.out.println("Age: " + brucePang.getAge());
    }
}