import com.sun.istack.internal.NotNull;

public class AimClassProxy implements AimClassInterface {
    private AimClassInterface mAimClassInterface;

    AimClassProxy(@NotNull AimClassInterface mAimClassInterface){
        this.mAimClassInterface = mAimClassInterface;
    }

    @Override
    public void doSomething() {
        System.out.println("I am proxy.");
        mAimClassInterface.doSomething();
    }

    @Override
    public void doSomethingElse(String ss) {
        System.out.println("I am proxy.");
        mAimClassInterface.doSomethingElse(ss);
    }
}
