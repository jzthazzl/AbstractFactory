package Test2;

public class SRfarm implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("马出生了...");
        return new A_Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果成熟了...");
        return new P_Fruitage();
    }
}
