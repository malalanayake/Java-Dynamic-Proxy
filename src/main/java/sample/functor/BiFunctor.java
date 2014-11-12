package sample.functor;

/**
 *
 * @author malalanayake
 */
public interface BiFunctor<T> {

    public void before(T t);

    public void after(T t);
}
