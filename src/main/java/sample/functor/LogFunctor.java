package sample.functor;

/**
 *
 * @author malalanayake
 */
public class LogFunctor<T> implements BiFunctor<T> {

    @Override
    public void before(T t) {
        System.out.println(t);

    }

    @Override
    public void after(T t) {
        System.out.println(t);

    }
}
