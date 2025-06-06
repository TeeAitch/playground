package dnd.classes;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import dnd.Player;
import dnd.Race;
import sources.equipment.ArmorTypes;
import sources.equipment.WeaponTypes;

public class DndClasses extends Player {
    private ArmorTypes[] armorProficiencies;
    private WeaponTypes[] weaponProficiencies;

    /**
     * Creates a dnd class
     * 
     * @param name  name of the player
     * @param level level of the player
     * @param race  of the player
     */
    public DndClasses(String name, Race race) {
        super(name, race);
    }

    protected void setArmorProficiencies(ArmorTypes[] armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    protected void setWeaponProficiencies(WeaponTypes[] weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
    }

    /**
     * Helper function to get proficiencys for a specific equipment type
     * 
     * @param <T>       type of the proficiency item
     * @param equipment array of proficiency items
     * @param getString function to get the string from an enum
     * @return a string with all proficiencys
     */
    private <T> String getProficiencys(T[] equipment, Function<T, String> getString) {
        return Arrays.stream(equipment)
                .map(getString)
                .collect(Collectors.joining("\n"));
    }

    /**
     * Get all armor proficiencies the class has
     * 
     * @return armor proficiencies
     */
    public String getArmorProficiencies() {
        return getProficiencys(this.armorProficiencies, ArmorTypes::getString);
    }

    /**
     * Get all weapon proficiencies the class has
     * 
     * @return weapon proficiencies
     */
    public String getWeaponProficiencies() {
        return getProficiencys(this.weaponProficiencies, WeaponTypes::getString);
    }

    /**
     * Return the class as readable string
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
