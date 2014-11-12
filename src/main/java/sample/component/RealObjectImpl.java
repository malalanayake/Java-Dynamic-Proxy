package sample.component;

/**
 *
 * @author malalanayake
 */
public class RealObjectImpl implements RealObject<String> {

    String name;

    public RealObjectImpl(String name) {
        this.name = name;
    }

    @Override
    public void compute(String name) {
        System.out.println(this.name + " compute " + name);
    }
}
