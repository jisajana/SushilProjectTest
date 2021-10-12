package Day15;

public class FactoryPatternRunner {
    public static void main(String[] args) {
    GarmentFactory garmentFactory = new GarmentFactory();
    Garment shirt = garmentFactory.getGarment("shirt");
    shirt.produce();

    Garment pant = garmentFactory.getGarment("pant");
    pant.produce();

    Garment jacket = garmentFactory.getGarment("jacket");
    jacket.produce();

    }
}
