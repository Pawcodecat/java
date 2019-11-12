package agh.cs.lab2;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MapDirectionTest {
    MapDirection polnoc = MapDirection.NORTH;
    MapDirection poludnie = MapDirection.SOUTH;
    MapDirection wschod = MapDirection.EAST;
    MapDirection zachod = MapDirection.WEST;

    @Test
    public void testnext(){
        assertEquals(polnoc.next(),wschod);
        assertEquals(poludnie.next(),zachod);
        assertEquals(wschod.next(),poludnie);
        assertEquals(zachod.next(),polnoc);
    }

    @Test
    public void testprevious(){
        assertEquals(polnoc.previous(),zachod);
        assertEquals(poludnie.previous(),wschod);
        assertEquals(wschod.previous(),polnoc);
        assertEquals(zachod.previous(),poludnie);
    }

}
