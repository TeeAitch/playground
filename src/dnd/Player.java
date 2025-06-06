package dnd;

import java.util.Random;

import exceptions.LevelToHighException;

/**
 * This Class Represents the base player
 * it holds data like name, level, race and Methods
 * to access the data
 */
public class Player {
    public final int MAX_LEVEL = 20;
    private String name;
    private int hitPoints;
    private int level;
    private Race race;
    private static int getCurrentPlayers = 0;
    Random rnd = new Random();

    /**
     * Creates a new Player with name, level and race
     * the hitpoint will be generated Random in a range from 10 to 23.
     * 
     * @param name  name of the player
     * @param level the current level of the player
     * @param race  the race of the player
     */
    public Player(String name, Race race) {
        this.name = name;
        this.level = 1;
        this.hitPoints = rnd.nextInt(10, 24);
        this.race = race;
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
}
