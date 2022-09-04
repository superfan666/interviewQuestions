import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class main {
    public static void main(String[] args) {
//        //静态代理
//        consumer(new AimClass());
//        consumer(new AimClassProxy(new AimClass()));
        AimClass mAimClass = new AimClass();
        consumer(mAimClass);

        DynamicProxyHandler mDynamicProxyHandler = new DynamicProxyHandler(new AimClass());
        AimClassInterface aimClassInterface = (AimClassInterface) Proxy.newProxyInstance(AimClassInterface.class.getClassLoader(),
                new Class[]{AimClassInterface.class,TestSecondInterface.class}, mDynamicProxyHandler);
        consumer(aimClassInterface);
        consumerSecond((TestSecondInterface)aimClassInterface);
    }

    private static void consumer(AimClassInterface aimClass) {
        aimClass.doSomething();
        aimClass.doSomethingElse("hh");
    }

    private static void consumerSecond(TestSecondInterface aimClass) {
        aimClass.doSecondThings();
    }
}
