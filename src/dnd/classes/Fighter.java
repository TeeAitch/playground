package dnd.classes;

import dnd.Race;
import sources.equipment.ArmorTypes;
import sources.equipment.WeaponTypes;

/**
 * The Fighter has the Weapon Proficiency types
 * and the armor proficiency type for that class
 */
public class Fighter extends DndClasses {

    private static int fighterInstances = 0;

    /**
     * Creates a fighter class with the given name, level and race
     * 
     * @param name  name of the player
     * @param level level of the player
     * @param race  of the player
     */
    public Fighter(String name, Race race) {
        super(name, race);
        setArmorProficiencies(new ArmorTypes[] {
                ArmorTypes.LIGHT,
                ArmorTypes.MEDIUM,
                ArmorTypes.HEAVY
        });

        setWeaponProficiencies(new WeaponTypes[] {
                WeaponTypes.SIMPLE_MELEE_WEAPONS,
                WeaponTypes.SIMPLE_MARTIAL_WEAPONS,
                WeaponTypes.SIMPLE_RANGED_WEAPONS
        });
        fighterInstances++;
    }

    /**
     * Returns the number of current fighter instances
     * 
     * @return number of instances
     */
    public static int getFighterInstances() {
        return fighterInstances;
    }

    /**
     * Return the fighter in a readable S tring
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
