package sources.equipment;

/**
 * All available armor types in D&D
 */
public enum ArmorTypes {
    LIGHT("Light Armor"),
    MEDIUM("Medium Armor"),
    HEAVY("Heavy Armor");

    private final String armor;

    ArmorTypes(String armor) {
        this.armor = armor;
    }

    /**
     * Returns the string value from the enum
     * 
     * @return the string value
     */
    public String getString() {
        return this.armor;
    }
}