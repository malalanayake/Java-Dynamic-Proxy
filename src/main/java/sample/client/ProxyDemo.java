package sample.client;

import java.lang.reflect.Proxy;
import sample.component.DynamicLogProxy;
import sample.functor.LogFunctor;
import sample.functor.BiFunctor;
import sample.component.RealObjectImpl;
import sample.component.RealObject;

/**
 *
 * @author malalanayake
 */
public class ProxyDemo {

    public static void main(String[] args) {

        RealObject<String> realObject = new RealObjectImpl("A");
        realObject.compute("Hello");

        BiFunctor<String> functor = new LogFunctor<String>();
        RealObject<String> proxyObject = (RealObject<String>) Proxy.newProxyInstance(realObject.getClass().getClassLoader(),
                realObject.getClass().getInterfaces(),
                new DynamicLogProxy(realObject,functor));
        proxyObject.compute("Hello");
    }
}
