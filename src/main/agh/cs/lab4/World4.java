/**package agh.cs.lab4;



public class World4 {
    public static void main(String[] args) {
        MoveDirection[] directions = new OptionsParser().parse(args);
        IWorldMap map = new RectangularMap(10, 5);
        map.place(new Animal(map));
        map.place(new Animal(map,new Vector2d(3,4)));
        System.out.println(map);
        map.run(directions);
        System.out.println(map);

        String s1[];
        s1 = new String[]{"l", "r","l","l"};
        MoveDirection[] d2 = new OptionsParser().parse(s1);
        IWorldMap map_2 = new RectangularMap(10, 5);
        Animal animal_1 = new Animal(map_2, new Vector2d(2, 0));
        Animal animal_2 = new Animal(map_2, new Vector2d(3, 4));
        map_2.place(animal_1);
        map_2.place(animal_2);
        map_2.run(d2);
        System.out.println(map_2);

    }
}
**/