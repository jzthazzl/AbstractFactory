package Test1;

public abstract class AbstractBlackHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("-黑种人");
    }

    @Override
    public void talk() {
        System.out.println("-能交流");
    }

}
