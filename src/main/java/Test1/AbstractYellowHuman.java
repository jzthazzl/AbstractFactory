package Test1;

public abstract class AbstractYellowHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("-黄种人");
    }

    @Override
    public void talk() {
        System.out.println("-能交流");
    }
}
