import java.lang.reflect.Method;

class Sample {
    public void hello() {
        System.out.println("Hello from Sample");
    }
}

public class Reflection {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("Sample");
        Object obj = cls.getDeclaredConstructor().newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            method.invoke(obj);
        }
    }
}
