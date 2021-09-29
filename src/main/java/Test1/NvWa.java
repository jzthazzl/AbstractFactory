package Test1;

public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();
        Human maleBrownHuman = maleHumanFactory.createBrownHuman();
        Human femaleWhiteHuman = femaleHumanFactory.createWhiteHuman();

        System.out.println("一个男性棕色人种出生...");
        maleBrownHuman.getColor();
        maleBrownHuman.talk();
        maleBrownHuman.getSex();

        System.out.println("______________________");
        System.out.println("一个女性白种人出生...");
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getSex();
    }
}
