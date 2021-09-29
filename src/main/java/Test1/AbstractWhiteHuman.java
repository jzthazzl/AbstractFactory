package Test1;

public abstract class AbstractWhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("-白种人");
    }

    @Override
    public void talk() {
        System.out.println("-能交流");
    }
}
