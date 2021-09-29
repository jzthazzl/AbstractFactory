package Test2;

public class FarmTest {
    public static void main(String[] args) {
        Farm farm = new SGfarm();
        Farm farm1= new SRfarm();
        Animal animal;
        Plant plant;

        animal = farm.newAnimal();
        animal.show();
        plant = farm.newPlant();
        plant.show();

        animal = farm1.newAnimal();
        animal.show();
        plant = farm1.newPlant();
        plant.show();
    }
}
