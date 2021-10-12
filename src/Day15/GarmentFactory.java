package Day15;

public class GarmentFactory {

    public Garment getGarment(String name) {
        if (name.equals("shirt")) {
            return new Shirt();
        } else if (name.equals("pant")) {
            return new Pant();
        } else if (name.equals("jacket")) {
            return new Jacket();
        }
        return null;

    }
}
