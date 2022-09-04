public class AimClass implements AimClassInterface,TestSecondInterface {
    @Override
    public void doSomething() {
        System.out.println("do real things.");
    }

    @Override
    public void doSomethingElse(String ss) {
        System.out.println("do real things else : " + ss);
    }

    @Override
    public void doSecondThings() {
        System.out.println("do second things.");
    }
}
