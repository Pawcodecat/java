package agh.cs.lab2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


public class Vector2dTest {
    private Vector2d v_1_1 = new Vector2d(1, 1);
    private Vector2d v_1_2 = new Vector2d(1, 2);

    @Test
    public void testEquals() {
        assertTrue(v_1_1.equals(new Vector2d(1, 1)));
        assertFalse(v_1_1.equals(v_1_2));
    }

    @Test
    public void testtoString() {
        assertEquals(v_1_1.toString(),"(1,1)");
    }

    @Test
    public void testPrecedes() {
        assertTrue(v_1_1.precedes(v_1_2));
        assertFalse(v_1_1.precedes(new Vector2d(-2,0)));
    }

    @Test
    public void testfollows() {
        assertTrue(v_1_1.follows(new Vector2d(1,0)));
        assertFalse(v_1_1.follows(v_1_2));
    }

    @Test
    public void testupperRight() {
        assertEquals(v_1_1.upperRight(v_1_2),v_1_2);
    }

    @Test
    public void testlowerLeft() {
        assertEquals(v_1_1.lowerLeft(v_1_2),v_1_1);
    }

    @Test
    public void testadd() {
        assertEquals(v_1_1.add(v_1_2),new Vector2d(2,3));
    }

    @Test
    public void testsubtract() {
        assertEquals(v_1_1.subtract(v_1_2),new Vector2d(0,-1));
    }

    @Test
    public void testopposite() {
        assertEquals(v_1_1.opposite(),new Vector2d(-1,-1));
    }
}