package dnd.classes;

import dnd.Race;
import sources.equipment.ArmorTypes;
import sources.equipment.WeaponTypes;

public class Ranger extends DndClasses {
    private static int rangerInstances = 0;

    /**
     * Creates a ranger class with the given name, level and race
     * 
     * @param name  name of the player
     * @param level level of the player
     * @param race  of the player
     */
    public Ranger(String name, Race race) {
        super(name, race);
        setArmorProficiencies(new ArmorTypes[] {
                ArmorTypes.LIGHT,
                ArmorTypes.MEDIUM,
        });

        setWeaponProficiencies(new WeaponTypes[] {
                WeaponTypes.SIMPLE_MELEE_WEAPONS,
                WeaponTypes.SIMPLE_RANGED_WEAPONS
        });
        rangerInstances++;
    }

    /**
     * Returns the number of current fighter instances
     * 
     * @return number of instances
     */
    public static int getRangerInstances() {
        return rangerInstances;
    }

    /**
     * Return the fighter in a readable string
     */
    @Override
    public String toString() {
        return super.toString()
                + " the player class is "
                + getClass().getSimpleName()
                + " his Armor Proficiencys are: \n"
                + getArmorProficiencies() + "\nand weapon proficiencys are: \n"
                + getWeaponProficiencies();
    }
}
