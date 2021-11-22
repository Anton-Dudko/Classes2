import by.epam.lab.Material;
import by.epam.lab.Subject;

public class Runner {
    public static void main(String[] args) {
        Material steel = new Material("Steel", 7850);
        Subject wire = new Subject("Wire", steel, 0.03);
        System.out.printf(wire.toString() + "\n");

        Material copper = new Material("Copper", 8500);

        wire.setMaterial(copper);

        System.out.printf("The wire mass: " + wire.getMass() + "\n");
    }

}
