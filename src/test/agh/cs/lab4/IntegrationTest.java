/**package agh.cs.lab4;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static agh.cs.lab4.MoveDirection.*;
import static agh.cs.lab4.MoveDirection.LEFT;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    @Test
    public void integrationTest() {
    String[] s1;
        s1 = new String[]{"f", "b", "r", "l", "f", "f", "r", "r", "f", "f", "f", "f", "f", "f", "f", "f"};
        MoveDirection[] d1 = new OptionsParser().parse(s1);
        IWorldMap map_1 = new RectangularMap(10, 5);
        map_1.place(new Animal(map_1));
        map_1.place(new Animal(map_1, new Vector2d(3, 4)));
        map_1.run(d1);
        System.out.println(map_1);

        String s2[];
        s2 = new String[]{"l", "r","l","l"};
        MoveDirection[] d2 = new OptionsParser().parse(s2);
        IWorldMap map_2 = new RectangularMap(10, 5);
        Animal animal_1 = new Animal(map_2, new Vector2d(2, 0));
        Animal animal_2 = new Animal(map_2, new Vector2d(3, 4));
        map_2.place(animal_1);
        map_2.place(animal_2);
        map_2.run(d2);
        System.out.print(map_2);


            assertEquals(map_2.toString(), map_1.toString() );
        }





}
**/