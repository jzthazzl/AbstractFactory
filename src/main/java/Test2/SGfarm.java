package Test2;

public class SGfarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("牛出生了...");
        return new A_Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜成熟了...");
        return new P_Vegetables();
    }
}
