package sample.component;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import sample.functor.BiFunctor;

/**
 *
 * @author malalanayake
 */
public class DynamicLogProxy implements InvocationHandler {

    Object target;
    BiFunctor<String> biFunctor = null;

    public DynamicLogProxy(Object target, BiFunctor<String> biFunctor) {
        this.target = target;
        this.biFunctor = biFunctor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        biFunctor.before("Before method " + method.getName() + "() begins with " + Arrays.toString(args));

        Object result = method.invoke(target, args);

        biFunctor.after("After method " + method.getName() + "() ends ");

        return result;
    }

}
