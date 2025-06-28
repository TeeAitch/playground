package dnd;

import java.util.Random;

import exceptions.LevelToHighException;

/**
 * This Class Represents the base player
 * it holds data like name, level, race and Methods
 * to access the data
 */
public abstract class Player {

    private final int MAX_LEVEL = 20;
    private final int STARTING_LEVEL = 1;
    private final int MIN_HP = 10;
    private final int MAX_HP = 24;
    protected static int getCurrentPlayers = 0;
    protected String name;
    protected BodyType bodyType;
    protected int level;
    protected int hitPoints;
    protected Race race;
    private Random rnd = new Random();

    /**
     * Creates a new Player with name, level and race
     * the hitpoint will be generated Random in a range from 10 to 23.
     * 
     * @param name  name of the player
     * @param level the current level of the player
     * @param race  the race of the player
     */
    public Player(String name, BodyType bodyType, Race race) {
        this.name = name;
        this.level = STARTING_LEVEL;
        this.hitPoints = rnd.nextInt(MIN_HP, MAX_HP);
        this.race = race;
        this.bodyType = bodyType;
        getCurrentPlayers++;
    }

    /**
     * Returns the name of the player
     * 
     * @return the player name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns the level of the player
     * 
     * @return the player level
     */
    public int getLevel() {
        return this.level;
    }

    /**
     * Returns the hitpoints of the player
     * 
     * @return the player hitpoints
     */
    public int getHitPoints() {
        return this.hitPoints;
    }

    /**
     * Returns the race of the player
     * 
     * @return the player race
     */
    public Race getRace() {
        return this.race;
    }

    /**
     * Returns the body type of the player
     * 
     * @return the player body type
     */
    public BodyType getBodyType() {
        return this.bodyType;
    }

    /**
     * Gets the current Instances of the player class
     * 
     * @return player instances
     */
    public static int getCurrentPlayers() {
        return getCurrentPlayers;
    }

    public final void setLevel(int level) throws LevelToHighException {
        if (level > MAX_LEVEL) {
            throw new LevelToHighException("Level can't be over 20");
        }
        this.level = level;
    }

    /**
     * return a readable version of the player
     * 
     * @return the player as String
     */
    @Override
    public String toString() {
        return "Player: " + this.name
                + " is Level " + this.level
                + " has " + this.hitPoints + " HitPoints "
                + "and is a " + this.race.getString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Player other = (Player) obj;
        return this.level == other.level &&
                this.name.equals(other.name) &&
                this.race == other.race &&
                this.bodyType == other.bodyType;
    }
}
