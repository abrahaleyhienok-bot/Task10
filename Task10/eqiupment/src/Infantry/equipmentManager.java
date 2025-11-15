package Infantry;

public class equipmentManager {
    private String equipmentOne;
    private String equipmentTwo;

    public equipmentManager(String eq1, String eq2) {
        this.equipmentOne = eq1;
        this.equipmentTwo = eq2;
    }

    public void displayEquipment() {
        System.out.println("=== Military Equipment ===");
        System.out.println("- " + equipmentOne);
        System.out.println("- " + equipmentTwo);
    }
}
