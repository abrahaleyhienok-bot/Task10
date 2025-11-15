package militaryapp;

import division.SoldierManager;
import Infantry.equipmentManager;

public class Main {
    public static void main(String[] args) {
        SoldierManager soldierManager = new SoldierManager(
                "John Michael", "Captain",
                "Samuel Haile", "Lieutenant"
        );

        equipmentManager equipmentManager = new equipmentManager(
                "Tank", "Assault Rifle"
        );

    }
}
