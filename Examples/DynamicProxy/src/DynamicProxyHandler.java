import com.sun.istack.internal.NotNull;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private Object obj;
    DynamicProxyHandler(@NotNull Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I am dynamicProxy.");
        return method.invoke(obj,args);
    }
}
