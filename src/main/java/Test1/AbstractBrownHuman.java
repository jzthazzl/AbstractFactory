package Test1;

public abstract class AbstractBrownHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("-棕色人种");
    }

    @Override
    public void talk() {
        System.out.println("-能交流");
    }
}
