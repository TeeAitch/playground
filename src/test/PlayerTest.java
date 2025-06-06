package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import dnd.Player;
import dnd.Race;
import exceptions.LevelToHighException;

public class PlayerTest {
    static Player p;

    @BeforeAll
    static void setup() {
        p = new Player("TestPlayer", Race.HUMAN);
    }

    @Test
    public void playerLevelShouldBeOneByCreation() {
        Player playerLevelOne = new Player("LevelOne", Race.HUMAN);
        assertEquals(1, playerLevelOne.getLevel());
    }

    @Test
    public void playerLevelShouldNeverBeGreaterThanTwenty() {
        assertThrows(LevelToHighException.class, () -> {
            p.setLevel(21);
        });
    }

    @Test
    public void setPlayerLevel() throws LevelToHighException {
        p.setLevel(5);
        assertEquals(5, p.getLevel());
    }

    @Test
    public void getNameShouldBeThePlayerName() {
        assertEquals("TestPlayer", p.getName());
    }

    @Test
    public void getRaceShouldBeTheRace() {
        assertEquals(Race.HUMAN, p.getRace());
    }

    @Test
    public void currentPlayerInstancesShouldBeOne() {
        assertEquals(2, Player.getCurrentPlayers());
    }

    @Test
    public void hitPointsShouldBeBetweenTenAndTwentyFour() {
        int playerHp = p.getHitPoints();
        assertTrue(playerHp >= 10 && playerHp < 24, "Hitpoints should be between 10 and 24");
    }

    @Test
    public void generateToString() {

        String generateToString = "Player: " + p.getName()
                + " is Level " + p.getLevel()
                + " has " + p.getHitPoints() + " HitPoints "
                + "and is a " + p.getRace().getString();

        assertEquals(generateToString, p.toString());
    }

}
