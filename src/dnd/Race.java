package dnd;

/**
 * Has all Races that are available for choice
 */
public enum Race {
    HUMAN("Human"),
    ORC("Orc"),
    ELF("Elf"),
    DWARF("Dwarf"),
    HALFLING("Halfling"),
    GOLIATH("Goliath");

    public final String race;

    Race(String race) {
        this.race = race;
    }

    /**
     * Returns the string value from the enum
     * 
     * @return the string value
     */
    public String getString() {
        return this.race;
    }
}