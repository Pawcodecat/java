package agh.cs.lab2;

public class World {
    public static void main(String[] args) {
        Vector2d V1 = new Vector2d(2, 1);
        Vector2d V2 = new Vector2d(5, 1);
        System.out.println(V1.toString());
        System.out.println(V1.precedes(V2));
        System.out.println(V1.follows(V2));

        System.out.println(V1.lowerLeft(V2).toString());
        System.out.println(V1.upperRight(V2).toString());

        System.out.println(V1);
        System.out.println(V2.upperRight(V1));
        System.out.println(V2.lowerLeft(V1));
        System.out.println(V1.add(V2));
        System.out.println(V1.subtract(V2));
        System.out.println(V1.equals(V2));
        System.out.println(V1.opposite());

        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));

        MapDirection pn=MapDirection.NORTH;
        System.out.println(pn);
        System.out.println(pn.next());
        System.out.println(pn.previous());
        System.out.println(pn.toUnitVector());



    }
}
