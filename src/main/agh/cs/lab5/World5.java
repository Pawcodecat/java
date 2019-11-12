package agh.cs.lab5;

import java.util.ArrayList;
import java.util.List;

public class World5 {
    public static void main(String[] args) {
     /*   List<Grass> grasses = new ArrayList<>();
        grasses.add(new Grass(new Vector2d(-4,-4)));
        grasses.add(new Grass(new Vector2d(7,7)));
        grasses.add(new Grass(new Vector2d(3,-6)));
        grasses.add(new Grass(new Vector2d(2,0)));
         MoveDirection[] directions = new OptionsParser().parse(args);
 */
        IWorldMap mapRectangular = new RectangularMap(10,5);
        Animal cat = new Animal(mapRectangular,new Vector2d(3,4));
        System.out.println(cat);
        mapRectangular.place(new Animal(mapRectangular));
        mapRectangular.place(new Animal(mapRectangular,new Vector2d(3,4)));

        System.out.println(mapRectangular);
        MoveDirection[] directions = new OptionsParser().parse(args);
        mapRectangular.run(directions);
        System.out.println(mapRectangular);


        IWorldMap mapGrass = new GrassField(10);
        Animal a = new Animal(mapGrass);
        Animal b = new Animal(mapGrass,new Vector2d(3,4));
        mapGrass.place(a);
        mapGrass.place(b);
        System.out.println(mapGrass);
        mapGrass.run(directions);
        System.out.println(mapGrass);

    }
}
