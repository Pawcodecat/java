/**
package agh.cs.lab4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static agh.cs.lab4.MoveDirection.*;
import static org.junit.Assert.*;

public class AnimalTest {

    private IWorldMap map;
    private Animal a, b, c, d;

    @Before
    public void setUp() {
        this.map = new RectangularMap(5, 6);
        a = new Animal(map);   // (2,2) north
        b = new Animal(map);
        b.move(FORWARD);
        b.move(LEFT);
        b.move(FORWARD);    // (1,3) west
        c = new Animal(map);
        c.move(BACKWARD);
        c.move(BACKWARD);
        c.move(BACKWARD);
        c.move(RIGHT);      // (2,0) east
        d = new Animal(map);
        d.move(LEFT);
        d.move(FORWARD);
        d.move(FORWARD);
        d.move(FORWARD);
        d.move(LEFT);
        d.move(FORWARD);
        d.move(FORWARD);
        d.move(FORWARD);    // (0,0) south
    }
    @Test
    public void testToStringLong(){
        assertEquals(a.toStringLong(), "pozycja: (2,2) | kierunek: Północ");
    }

    @Test
    public void orientationTest() {
        assertEquals(a.getDirection(), MapDirection.NORTH);
        assertEquals(b.getDirection(), MapDirection.WEST);
        assertEquals(c.getDirection(), MapDirection.EAST);
        assertEquals(d.getDirection(), MapDirection.SOUTH);
    }

    @Test
    public void moveTest() {
        assertEquals(a.getPosition(), new Vector2d(2,2));
        assertEquals(b.getPosition(), new Vector2d(1,3));
        assertEquals(c.getPosition(), new Vector2d(2,0));
        assertEquals(d.getPosition(), new Vector2d(0,0));
    }
}
 **/