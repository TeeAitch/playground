package sources.equipment;

/**
 * All available weapon types in D&D
 */
public enum WeaponTypes {
    SIMPLE_MELEE_WEAPONS("simple melee weapon"),
    SIMPLE_RANGED_WEAPONS("simple ranged weapon"),
    SIMPLE_MARTIAL_WEAPONS("simple martial weapons");

    private final String weapon;

    WeaponTypes(String weapon) {
        this.weapon = weapon;
    }

    /**
     * Returns the string value from the enum
     * 
     * @return the string value
     */
    public String getString() {
        return this.weapon;
    }
}